public static void sort(java.lang.Comparable[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++) {
        int min = i;
        for (int j = i + 1; j < N; j++) {
            if ((a[i].compareTo(a[j])) > 0)
                min = j;
            
        }
        sort.Selection.swap(a, i, min);
    }
}