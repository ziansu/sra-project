public Item removeLast() {
    if ((last) == null) {
        throw new java.util.NoSuchElementException();
    }
    if ((last.previous) != null) {
        Deque<Item>.Node node = last;
        last = last.previous;
        last.next = null;
        (size)--;
        return node.item;
    }else {
        Deque<Item>.Node node = last;
        first = null;
        last = null;
        (size)--;
        return node.item;
    }
}