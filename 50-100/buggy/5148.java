private final double[] sds(final double[] psis) {
    double[] sds = new double[psis.length];
    for (int i = 0; i < (sds.length); i++) {
        sds[i] = (java.lang.Math.sqrt(psis[i])) + (net.digital_alexandria.lvm4j.decomposition.FactorAnalysis.PSEUDO_COUNT);
    }
    return sds;
}