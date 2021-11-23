public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    queue[tail] = item;
    ++(size);
    swap(tail, randomIndex());
    tail = (++(tail)) % (queue.length);
    if ((size) > ((queue.length) / 2.0)) {
        changeQueueSize(((queue.length) * 2));
    }
}