public static double timeSortedInput(java.lang.String alg, int n, int trials) {
    double total = 0.0;
    java.lang.Double[] a = new java.lang.Double[n];
    for (int t = 0; t < trials; t++) {
        for (int i = 0; i < n; i++) {
            a[i] = 1.0 * i;
        }
        total += SortCompare.time(alg, a);
    }
    return total;
}