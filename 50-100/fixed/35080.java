public static void main(java.lang.String[] args) {
    int n = java.lang.Integer.parseInt(args[0]);
    int trials = java.lang.Integer.parseInt(args[1]);
    com.github.olegkoskin.algs4.percolation.PercolationStats percStats = new com.github.olegkoskin.algs4.percolation.PercolationStats(n, trials);
    java.lang.System.out.println(("mean                    = " + (percStats.mean())));
    java.lang.System.out.println(("stddev                  = " + (percStats.stddev())));
    java.lang.System.out.printf("95%% confidence interval = %f, %f", percStats.confidenceLo(), percStats.confidenceHi());
}