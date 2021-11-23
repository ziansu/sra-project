public boolean add(T value) {
    if ((head) == null) {
        head = new LNode(value);
        tail = head;
    }else {
        MyLinkedList<T>.LNode p = new LNode(value);
        p.setPrev(tail);
        tail.setNext(p);
        tail = tail.getNext();
    }
    (size)++;
    return true;
}