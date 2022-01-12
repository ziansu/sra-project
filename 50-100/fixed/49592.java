public Item removeLast() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    final Deque<Item>.Node oldLast = last;
    if ((size) == 1) {
        first = null;
        last = null;
    }else {
        last = oldLast.prev;
        last.next = null;
    }
    (size)--;
    return oldLast.item;
}