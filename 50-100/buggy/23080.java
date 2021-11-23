public LinkedList<E>.Node append(E v) {
    LinkedList<E>.Node newNode = new Node(last, null, v);
    if ((first) != null) {
        last.next = newNode;
        last = newNode;
    }else {
        first = newNode;
        last = newNode;
    }
    newNode.prev = last;
    size = (size) + 1;
    return newNode;
}