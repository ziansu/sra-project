public Item removeLast() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    Deque<Item>.Node oldLast = last;
    if ((last.prev) == null) {
        last = null;
        first = null;
    }else {
        last.prev.next = null;
        last = last.prev;
    }
    (size)--;
    return oldLast.value;
}