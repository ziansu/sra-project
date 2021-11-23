public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException("Attempt to add null Item.");
    }
    Deque<Item>.Node oldlast = last;
    Deque<Item>.Node newlast = new Node();
    newlast.item = item;
    newlast.previous = oldlast;
    if (oldlast != null) {
        oldlast.next = newlast;
    }
    last = newlast;
    (size)++;
    if ((size) == 1) {
        first = last;
    }
}