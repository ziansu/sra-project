public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Container old = last;
    last = new Container(item);
    if ((size) == 0) {
        first = last;
    }
    last.prev = old;
    if (old != null) {
        old.next = last;
    }
    (size)++;
}