public void addFirst(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    final Deque<Item>.Node oldFirst = first;
    first = new Node(item);
    if ((size) == 0) {
        first.next = null;
        first.prev = null;
        last = first;
    }else {
        first.next = oldFirst;
        oldFirst.prev = first;
        first.prev = null;
        if ((size) == 1)
            last.prev = oldFirst;
        
    }
    (size)++;
}