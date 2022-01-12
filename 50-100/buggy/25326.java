public void push(E value) {
    if ((heapSize) == (data.length)) {
        throw new myUtils.BinaryHeap.HeapException("Heap's underlying storage is overflow");
    }
    (heapSize)++;
    this.data[((heapSize) - 1)] = value;
    siftUp(((heapSize) - 1));
}