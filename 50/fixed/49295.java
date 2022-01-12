public static void sort(java.lang.Comparable[] a) {
    java.lang.Comparable[] aux = new java.lang.Comparable[a.length];
    Algorithms.Sorting.MergeSort.sort(a, aux, 0, ((a.length) - 1));
}