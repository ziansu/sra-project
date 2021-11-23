public Item removeLast() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    Deque<Item>.Node oldLast = last;
    (size)--;
    if ((last.prev) == null) {
        last = null;
        first = null;
    }else {
        last.prev.next = null;
        last = last.prev;
    }
    return oldLast.value;
}