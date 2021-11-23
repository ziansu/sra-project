public static double quantile(double p, double k, double theta, double shift) {
    return ((net.jafama.FastMath.log(de.lmu.ifi.dbs.elki.math.statistics.distribution.GammaDistribution.quantile(p, k, 1))) / theta) + shift;
}