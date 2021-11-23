public static void shuffle(java.lang.Object[] a) {
    for (int i = 1; i < (a.length); i++) {
        int r = edu.princeton.cs.algs4.StdRandom.uniform(0, i);
        java.lang.Object x = a[i];
        a[i] = a[r];
        a[r] = x;
    }
}