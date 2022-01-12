public void addFirst(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    first.pre = null;
    if (oldFirst != null) {
        oldFirst.pre = first;
    }else {
        last = first;
    }
    (size)++;
}