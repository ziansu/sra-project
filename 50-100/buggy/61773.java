private double getMaximumMdcg(int queryId, int cut) {
    double maximumMdcg = 1.0;
    for (int j = 2; j <= cut; j++) {
        double log = (java.lang.Math.log10(j)) / (java.lang.Math.log10(2.0));
        maximumMdcg += 1.0 / log;
    }
    return maximumMdcg;
}