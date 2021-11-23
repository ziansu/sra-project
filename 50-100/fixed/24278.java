public DLList<E>.Node addFirst(E e) {
    DLList<E>.Node node = new Node(e);
    if ((first) != null) {
        first.prev = node;
        node.next = first;
    }
    if ((last) == null) {
        last = node;
    }
    first = node;
    return node;
}