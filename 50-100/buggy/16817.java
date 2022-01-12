public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if (this.isEmpty()) {
        last.item = item;
        last.next = null;
        last.pre = null;
        first = last;
    }else {
        Deque<Item>.Node oldLast = last;
        last = new Node();
        last.item = item;
        last.pre = oldLast;
        last.next = null;
        oldLast.next = last;
    }
}