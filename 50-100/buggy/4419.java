public Item removeLast() {
    if (!(isEmpty())) {
        if ((size) == 1) {
            Item item = last.item;
            last = null;
            first = null;
            (size)--;
            return item;
        }
        Deque<Item>.Node oldLast = last;
        last = oldLast.prev;
        last.next = null;
        (size)--;
        return oldLast.item;
    }else {
        throw new java.util.NoSuchElementException("The deque is empty");
    }
}