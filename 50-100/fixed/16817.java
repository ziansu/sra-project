public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (oldLast != null) {
        last.pre = oldLast;
        oldLast.next = last;
    }else {
        first = last;
    }
    (size)++;
}