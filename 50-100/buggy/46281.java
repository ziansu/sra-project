public boolean add(int value) {
    if ((size) == 0) {
        start = new MyLinkedList.LNode(value);
        end = start;
    }else {
        MyLinkedList.LNode next = new MyLinkedList.LNode(value);
        end.setNext(next);
        end = end.getNext();
    }
    (size)++;
    MyLinkedList.debug((((size) + "  ") + (end.getValue())));
    return true;
}