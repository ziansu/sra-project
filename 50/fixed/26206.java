public static double szstud(double x, double p, int n) {
    return p - (org.mathIT.statistics.Probability.studentDistribution(x, n));
}