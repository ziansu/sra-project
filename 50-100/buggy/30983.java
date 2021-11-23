private void quickSort(int start, int end) {
    if (start < end) {
        int p = findPivot(start, end);
        int newP = partition(p, start, end);
        quickSort(0, (newP - 1));
        quickSort((newP + 1), end);
    }
}