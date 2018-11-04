import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {

		int sampleSize, runningCount = 0;
		float sum0 = 0, sum1 = 0, sum2 = 0, sum3 = 0, max = 0, min = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the sample size: ");
		sampleSize = input.nextInt();

		float[] Trial0 = new float[sampleSize];
		float[] Trial1 = new float[sampleSize];
		float[] Trial2 = new float[sampleSize];
		float[] Trial3 = new float[sampleSize];
		float[] averages = new float[4];	

		System.out.println("Enter numbers for Trial 0");
		while (runningCount < sampleSize) {
			System.out.println("Enter sample #" + runningCount);
			Trial0[runningCount] = input.nextInt();
			sum0 += Trial0[runningCount];
			runningCount++;
		}
		runningCount = 0;
		averages[0] = (int)(sum0/sampleSize);

		System.out.println("Enter numbers for Trial 1");
		while (runningCount < sampleSize) {
			System.out.println("Enter sample #" + runningCount);
			Trial1[runningCount] = input.nextInt();
			sum1 += Trial1[runningCount];
			runningCount++;
		}
		runningCount = 0;
		averages[1] = (int)(sum1/sampleSize);

		System.out.println("Enter numbers for Trial 2");
		while (runningCount < sampleSize) {
			System.out.println("Enter sample #" + runningCount);
			Trial2[runningCount] = input.nextInt();
			sum2 += Trial2[runningCount];
			runningCount++;
		}
		runningCount = 0;
		averages[2] = (int)(sum2/sampleSize);

		System.out.println("Enter numbers for Trial 3");
		while (runningCount < sampleSize) {
			System.out.println("Enter sample #" + runningCount);
			Trial3[runningCount] = input.nextInt();
			sum3 += Trial3[runningCount];
			runningCount++;
		}
		runningCount = 0;
		averages[3] = (int)(sum3/sampleSize);

		input.close();

		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
		while (runningCount < sampleSize) {
			System.out.println("\t" + runningCount + "\t\t" + (int)Trial0[runningCount] + "\t" + (int)Trial1[runningCount] + "\t" + (int)Trial2[runningCount] + "\t" + (int)Trial3[runningCount] + "\t");
			runningCount ++;

		}
		runningCount = 0;

		min = averages[0];
		max = averages[0];
		while (runningCount < 3) {
			if (averages[runningCount] > averages[runningCount+1])
				min = averages[runningCount+1];
			if (averages[runningCount] < averages[runningCount+1])
				max = averages[runningCount+1];
			runningCount++;
		}

		System.out.println("\t-------------------------------------------------------");
		System.out.println("Average:\t\t" + (int)averages[0] + "\t" + (int)averages[1] + "\t" + (int)averages[2] + "\t" + (int)averages[3] + "\t");
		System.out.println("Min Average: " + (int)min);
		System.out.println("Max Average: " + (int)max);

		if (min == max)
			System.out.println("The trials match EXACTLY!");
		else if (max < 2 * min)
			System.out.println("The trials concur with each other!");
		else
			System.out.println("The trials do not concur!");

	}
}
