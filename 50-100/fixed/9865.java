public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Node old = last;
    last = new Node();
    last.item = item;
    last.backward = old;
    last.forward = null;
    (size)++;
    if ((size) == 1) {
        first = last;
    }else {
        old.forward = last;
    }
}