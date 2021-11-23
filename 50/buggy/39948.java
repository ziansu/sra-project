protected static double norm(int[] profile) {
    double agg = 0;
    for (int v : profile) {
        agg += v * v;
    }
    return java.lang.Math.sqrt(agg);
}