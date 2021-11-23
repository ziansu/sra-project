private void printResults() {
    mean = mean();
    java.lang.System.out.println(("mean                    = " + (mean)));
    double stddev = stddev();
    java.lang.System.out.println(("stddev                  = " + stddev));
    double x1 = confidenceLo();
    double x2 = confidenceHi();
    java.lang.System.out.println((((("95% confidence interval = [" + x1) + ", ") + x2) + "]"));
}