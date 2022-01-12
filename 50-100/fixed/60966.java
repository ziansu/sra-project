public static double mean(double[] a, int lo, int hi) {
    edu.princeton.cs.algs4.StdStats.validateNotNull(a);
    edu.princeton.cs.algs4.StdStats.validateSubarrayIndices(lo, hi, a.length);
    int length = (hi - lo) + 1;
    if (length == 0)
        return java.lang.Double.NaN;
    
    double sum = edu.princeton.cs.algs4.StdStats.sum(a, lo, hi);
    return sum / length;
}