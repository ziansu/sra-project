public Item dequeue() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    int removeId = RandomizedQueue.uniform(((tail) + 1));
    Item removed = queue[removeId];
    if ((tail) != removeId) {
        queue[removeId] = queue[tail];
    }
    (tail)--;
    if ((size()) == ((queue.length) / 4)) {
        queue = halfArray(queue);
    }
    return removed;
}