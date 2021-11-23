public Item next() {
    if ((current.next) == null) {
        throw new java.util.NoSuchElementException();
    }
    Item item = current.item;
    current = current.next;
    return item;
}