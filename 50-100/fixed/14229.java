public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty())
        first = last;
    else {
        oldLast.next = last;
        last.previous = oldLast;
    }
    (numOfItems)++;
}