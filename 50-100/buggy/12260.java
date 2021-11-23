public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    final Deque<Item>.Node oldlast = last;
    last = new Node(item);
    if ((size) == 0) {
        last.next = null;
        last.prev = null;
        first = last;
    }else {
        oldlast.next = last;
        last.prev = oldlast;
        last.next = null;
        if ((size) == 1)
            first.next = last;
        
    }
    (size)++;
}