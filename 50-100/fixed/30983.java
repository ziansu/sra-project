private void quickSort(int start, int end) {
    if (start < end) {
        int p = findPivot(start, end);
        int newP = partition(p, start, end);
        quickSort(start, (newP - 1));
        quickSort((newP + 1), end);
    }
}