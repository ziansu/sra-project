protected void orderHeap() {
    if (!(dirty)) {
        return ;
    }
    heapSort(1, ((size) + 1));
    dirty = false;
}