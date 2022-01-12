public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    last.preview = oldLast;
    if (oldLast != null)
        oldLast.next = last;
    
    if ((n) == 0)
        first = last;
    
    (n)++;
}