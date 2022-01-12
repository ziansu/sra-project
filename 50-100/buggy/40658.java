public void addLast(Item item) {
    if (item.equals(null))
        throw new java.lang.NullPointerException();
    
    it.algorithms.stacksqueues.Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    last.previous = oldLast;
    if (isEmpty()) {
        last = first;
    }
    (size)++;
}