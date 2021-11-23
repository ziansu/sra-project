public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Container old = last;
    if ((size) == 0) {
        first = last;
    }
    last = new Container(item);
    last.prev = old;
    old.next = last;
    (size)++;
}