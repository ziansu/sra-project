private static java.lang.Comparable[] sort(java.lang.Comparable[] arr, int left, int right) {
    if (left >= right) {
        return arr;
    }
    int mid = com.danny.datastruct.sort.QuickSort.adjustArray(arr, left, right);
    com.danny.datastruct.sort.QuickSort.sort(arr, left, (mid - 1));
    com.danny.datastruct.sort.QuickSort.sort(arr, (mid + 1), right);
    return arr;
}