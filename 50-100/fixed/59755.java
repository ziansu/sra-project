public Item sample() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException("Queue is currently empty");
    }
    int randIndex = edu.princeton.cs.algs4.StdRandom.uniform(0, size());
    RandomizedQueue<Item>.Node current = getIndex(randIndex);
    return current.item;
}