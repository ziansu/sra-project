public Item removeFirst() {
    if (this.isEmpty()) {
        throw new java.util.NoSuchElementException("No elements in Deque, cannot remove");
    }
    Deque<Item>.Node oldFirst = first;
    first = oldFirst.next;
    first.prev = null;
    (numberItems)--;
    return oldFirst.item;
}