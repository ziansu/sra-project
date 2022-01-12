public E pop() {
    E ret = data[0];
    if (empty()) {
        throw new myUtils.BinaryHeap.HeapException("Heap is empty");
    }
    this.data[0] = this.data[((heapSize) - 1)];
    (heapSize)--;
    if ((heapSize) > 0) {
        siftDown(0);
    }
    return ret;
}