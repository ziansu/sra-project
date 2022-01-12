public Item dequeue() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    Item item = queue[head];
    queue[head] = null;
    --(size);
    ++(head);
    head = (head) % (queue.length);
    if ((size) < ((queue.length) / 4)) {
        changeQueueSize(((queue.length) / 2));
    }
    return item;
}