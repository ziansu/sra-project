public static <T> void sort(final T[] array, final java.util.Comparator<T> cmp) {
    int n = 0;
    boolean isSorted = false;
    while (!isSorted) {
        if ((array.length) > 0)
            assert n < (array.length);
        
        isSorted = PermSort.PermSortAlgorithm(array, cmp, n);
        ++n;
    } 
}