private void maxHeapify(int[] a) {
    for (int start = ((a.length) - 1) / 2; start >= 0; start--) {
        siftDown(a, start, ((a.length) - 1));
    }
}