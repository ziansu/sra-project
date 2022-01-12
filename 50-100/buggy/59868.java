public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if (((tail) + 1) == (queue.length)) {
        queue = doubleArray(queue);
    }
    queue[((tail)++)] = item;
}