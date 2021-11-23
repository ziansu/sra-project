public Item dequeue() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException("No elements to remove");
    }
    if ((n) == ((items.length) / 4)) {
        resize(((items.length) / 2));
    }
    int i = edu.princeton.cs.algs4.StdRandom.uniform(0, n);
    Item item = items[i];
    items[i] = items[(--(n))];
    return item;
}