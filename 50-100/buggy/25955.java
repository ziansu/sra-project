public void addFirst(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Container old = first;
    if ((size) == 0) {
        last = first;
    }
    first = new Container(item);
    first.next = old;
    old.prev = first;
    (size)++;
}