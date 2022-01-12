public E pop() {
    E ret = data[0];
    if (empty()) {
        throw new myUtils.BinaryHeap.HeapException("Heap is empty");
    }
    this.data[0] = this.data[((this.heapSize) - 1)];
    (this.heapSize)--;
    if ((this.heapSize) > 0) {
        siftDown(0);
    }
    return ret;
}