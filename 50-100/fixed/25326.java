public void push(E value) {
    if ((this.heapSize) == (data.length)) {
        throw new myUtils.BinaryHeap.HeapException("Heap's underlying storage is overflow");
    }
    (this.heapSize)++;
    this.data[((this.heapSize) - 1)] = value;
    siftUp(((this.heapSize) - 1));
}