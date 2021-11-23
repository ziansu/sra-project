public void addFirst(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Container old = first;
    first = new Container(item);
    if ((size) == 0) {
        last = first;
    }
    first.next = old;
    if (old != null) {
        old.prev = first;
    }
    (size)++;
}