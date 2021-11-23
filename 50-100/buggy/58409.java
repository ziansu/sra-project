public void heapSort(int[] a) {
    maxHeapify(a);
    for (int end = (a.length) - 1; end <= 0; end--) {
        swap(a, end, 0);
        siftDown(a, 0, (end - 1));
    }
}