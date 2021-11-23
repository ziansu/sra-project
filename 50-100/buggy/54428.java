public void addFirst(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if (this.isEmpty()) {
        first.item = item;
        first.pre = null;
        first.next = null;
        last = first;
    }else {
        Deque<Item>.Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        first.pre = null;
        oldFirst.pre = first;
    }
}