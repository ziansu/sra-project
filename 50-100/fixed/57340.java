public Item removeLast() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    Deque<Item>.Node previous = null;
    Deque<Item>.Node current = first;
    while ((current.next) != null) {
        previous = current;
        current = current.next;
    } 
    if (previous != null) {
        previous.next = null;
    }else {
        first = null;
    }
    last = previous;
    (size)--;
    return current.item;
}