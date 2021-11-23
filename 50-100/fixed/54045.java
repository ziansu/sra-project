public static void parallelSort(final double[] a, final int[] linked) {
    if ((a.length) != (linked.length))
        throw new java.lang.IllegalArgumentException("arrays sizes are not equal");
    
    com.spbsu.commons.util.ArrayTools.parallelSort(a, linked, 0, ((a.length) - 1));
}