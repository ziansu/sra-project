public static void main(java.lang.String[] args) {
    int i = java.lang.Integer.parseInt(args[0]);
    int j = java.lang.Integer.parseInt(args[1]);
    PercolationStats pls = new PercolationStats(i, j);
    java.lang.System.out.printf("mean                     = %f\n", pls.mean());
    java.lang.System.out.printf("stddev                   = %f\n", pls.stddev());
    java.lang.System.out.printf("95%% confidence Interval  = %f, %f\n", pls.confidenceLo(), pls.confidenceHi());
}