private static boolean isSorted(java.lang.Object[] a, java.util.Comparator comparator) {
    return edu.princeton.cs.algs4.Insertion.isSorted(a, 0, ((a.length) - 1), comparator);
}