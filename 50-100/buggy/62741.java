public Item removeFirst() {
    if (!(isEmpty())) {
        if ((size) == 1) {
            Item item = first.item;
            first = null;
            last = null;
            (size)--;
            return item;
        }
        Deque<Item>.Node oldFirst = first;
        first = oldFirst.next;
        first.prev = null;
        (size)--;
        return oldFirst.item;
    }else {
        throw new java.util.NoSuchElementException("The deque is empty");
    }
}