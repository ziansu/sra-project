public static void main(java.lang.String[] args) {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();
    PercolationStats pls = new PercolationStats(i, j);
    java.lang.System.out.printf("mean                     = %f\n", pls.mean());
    java.lang.System.out.printf("stddev                   = %f\n", pls.stddev());
    java.lang.System.out.printf("95%% confidence Interval  = %f, %f\n", pls.confidenceLo(), pls.confidenceHi());
}