public double findMedianSortedArray(int[] a, int lo, int hi) {
    if ((hi - lo) < 0) {
        return -1;
    }
    int length = (hi - lo) + 1;
    int left = lo + ((length - 1) / 2);
    int right = lo + (length / 2);
    return ((a[left]) + (a[right])) / 2.0;
}