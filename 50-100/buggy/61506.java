public DLList<E>.Node addLast(E e) {
    DLList<E>.Node node = new Node(e);
    if ((last) != null) {
        last.next = node;
        node.prev = last;
    }
    if ((first) == null) {
        first = node;
    }
    last = node;
}