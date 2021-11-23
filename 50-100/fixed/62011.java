public void addLast(final Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    tail = new Node(item, null, tail);
    if (isEmpty()) {
        head = tail;
    }else {
        tail.previous.next = tail;
    }
    (size)++;
}