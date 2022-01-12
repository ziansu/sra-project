public static double cdf(double x, double mean, double alpha) {
    double theta = 1.0 / alpha;
    double p = theta / (theta + mean);
    try {
        return org.apache.commons.math.special.Beta.regularizedBeta(p, theta, (x + 1));
    } catch (org.apache.commons.math.MathException e) {
        return java.lang.Double.NaN;
    }
}