public void addLast(Item item) {
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