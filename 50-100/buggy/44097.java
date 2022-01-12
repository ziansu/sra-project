public Item removeLast() {
    if ((last) == null) {
        throw new java.util.NoSuchElementException();
    }
    Deque<Item>.Node oldLast = last;
    last = last.prior;
    if ((last) != null)
        last.next = null;
    
    (n)--;
    return oldLast.item;
}