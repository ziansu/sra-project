public void insertHead(int id) {
    idv.carl.datastructures.list.DoubleLinkedNode newNode = new idv.carl.datastructures.list.DoubleLinkedNode(id);
    if (isEmpty()) {
        tail = newNode;
    }else {
        head.setPrevious(newNode);
    }
    newNode.setNext(head);
    head = newNode;
    (size)++;
}