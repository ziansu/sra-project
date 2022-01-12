public Item removeLast() {
    if (!(isEmpty())) {
        Item item = last.item;
        Deque<Item>.Node oldLast = last;
        if ((oldLast.prev) == null) {
            last = null;
            first = null;
        }else {
            last = oldLast.prev;
            last.next = null;
        }
        (size)--;
        return item;
    }else {
        throw new java.util.NoSuchElementException("The deque is empty");
    }
}