public static final int[] createCanonicalZero(final int count) {
    final int[] blue;
    final int[] res;
    int num;
    if ((num = count) > 0) {
        res = new int[count];
        if ((--num) > 0) {
            blue = org.optimizationBenchmarking.utils.math.combinatorics.CanonicalPermutation.__blueprint(num);
            java.lang.System.arraycopy(blue, 1, res, 0, num);
        }
        return res;
    }
    return org.optimizationBenchmarking.utils.EmptyUtils.EMPTY_INTS;
}