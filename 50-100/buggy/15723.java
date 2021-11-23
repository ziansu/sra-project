public Item dequeue() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException("Queue is empty");
    }
    if ((size) == ((items.length) / 4)) {
        resize(items, ((items.length) / 2));
    }
    swap(edu.princeton.cs.algs4.StdRandom.uniform(size), ((size) - 1), items);
    (size)--;
    Item item = items[size];
    items[size] = null;
    return item;
}