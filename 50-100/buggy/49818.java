public Item removeLast() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException("can't remove the first Node, the deque is empty");
    }
    Item item = first.item;
    if ((N) == 1) {
        first = null;
        last = null;
        N = 0;
    }else {
        last = last.prev;
        last.next = null;
        (N)--;
    }
    return item;
}