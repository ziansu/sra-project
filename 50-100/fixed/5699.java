public Item sample() {
    if ((first) == null) {
        throw new java.util.NoSuchElementException();
    }
    int number = StdRandom.uniform(count);
    RandomizedQueue<Item>.Node current = first;
    for (int i = 0; i <= number; i++) {
        if (i != number) {
            current = current.next;
        }
    }
    return current.item;
}