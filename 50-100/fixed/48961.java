public Item removeFirst() {
    if (this.isEmpty()) {
        throw new java.util.NoSuchElementException("No elements in Deque, cannot remove");
    }
    Deque<Item>.Node oldFirst = first;
    first.prev = null;
    first = oldFirst.next;
    (numberItems)--;
    return oldFirst.item;
}