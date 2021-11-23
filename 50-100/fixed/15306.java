public boolean add(T value) {
    if ((head) == null) {
        head = new LNode(value);
        tail = head;
    }else {
        tail.setNext(new LNode(value));
        tail = tail.getNext();
    }
    (size)++;
    return true;
}