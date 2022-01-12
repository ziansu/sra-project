private static int[] inverseMapping(final int[] a2b, final int nb) {
    final int na = a2b.length;
    final int[] b2a = new int[nb];
    java.util.Arrays.fill(b2a, (-1));
    for (int da = 0; da < na; ++da) {
        final int db = a2b[da];
        if (db >= 0)
            b2a[da] = da;
        
    }
    return b2a;
}