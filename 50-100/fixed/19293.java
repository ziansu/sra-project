public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    if (isEmpty()) {
        first = last;
    }else {
        last.previous = oldLast;
        oldLast.next = last;
    }
    ++(n);
}