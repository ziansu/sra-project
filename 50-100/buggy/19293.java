public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.previous = oldLast;
    if (isEmpty()) {
        first = last;
    }else {
        oldLast.next = last;
    }
    (n)++;
}