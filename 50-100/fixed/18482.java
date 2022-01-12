public static double logcdf(double x, double k, double theta, double shift) {
    final double e = net.jafama.FastMath.exp(((x - shift) * theta));
    return e < (java.lang.Double.POSITIVE_INFINITY) ? de.lmu.ifi.dbs.elki.math.statistics.distribution.GammaDistribution.logregularizedGammaP(k, e) : 0.0;
}