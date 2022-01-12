private T[] sort(T[] arr, java.util.Comparator<? super T> comparator, int from, int to) {
    if (from >= to) {
        return arr;
    }
    int p = sources.algorithms.sorting.QuickSorter.partition(arr, comparator, from, to);
    sort(arr, comparator, from, p);
    sort(arr, comparator, (from + 1), to);
    return arr;
}