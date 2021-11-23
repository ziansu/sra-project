public static void sort(java.lang.Comparable[] a, int start, int end) {
    for (int i = start + 1; i < (end + 1); i++) {
        for (int j = i; j > 0; j--) {
            if ((a[(j - 1)].compareTo(a[j])) > 0) {
                sort.InsertionSort.exch(a, (j - 1), j);
            }else
                break;
            
        }
    }
}