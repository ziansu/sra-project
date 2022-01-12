public T peek() throws QueueEmptyException {
    if ((this.heap.size()) == 1) {
        throw new QueueEmptyException();
    }
    return this.heap.get(1);
}