public Item removeFirst() {
    if (!(isEmpty())) {
        Deque<Item>.Node oldFirst = first;
        Item item = oldFirst.item;
        if ((oldFirst.next) == null) {
            first = null;
            last = null;
        }else {
            first = oldFirst.next;
            first.prev = null;
        }
        (size)--;
        return item;
    }else {
        throw new java.util.NoSuchElementException("The deque is empty");
    }
}