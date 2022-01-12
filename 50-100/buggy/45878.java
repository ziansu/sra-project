public Item removeFirst() {
    if ((count) <= 0)
        throw new java.util.NoSuchElementException();
    
    (count)--;
    Deque<Item>.Node result = first;
    if ((count) <= 0) {
        first = null;
        last = null;
    }else {
        first = first.next;
    }
    return result.item;
}