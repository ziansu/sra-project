public T peek() throws QueueEmptyException {
    if ((this.heap.size()) == 0) {
        throw new QueueEmptyException();
    }
    return this.heap.get(0);
}