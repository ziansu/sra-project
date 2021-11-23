protected static double norm(final int[] profile) {
    double agg = 0;
    for (int v : profile) {
        agg += (1.0 * v) * v;
    }
    return java.lang.Math.sqrt(agg);
}