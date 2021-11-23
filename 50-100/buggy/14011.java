public int getMin() {
    if ((size) == 0) {
        throw new java.lang.IllegalStateException("Empty Heap");
    }
    int item = items[0];
    items[0] = items[((size) - 1)];
    (size)--;
    heapifyDown();
    return item;
}