public void addFirst(final Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    head = new Node(item, head, null);
    if (isEmpty()) {
        tail = head;
    }else {
        head.next.previous = head;
    }
    (size)++;
}