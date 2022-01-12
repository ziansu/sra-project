public void push(java.lang.Object data) {
    if (isEmpty()) {
        addFirst(data);
        return ;
    }
    DoublyLinkedList.DoublyLinkedList.Node temp = new DoublyLinkedList.DoublyLinkedList.Node(data);
    temp.setNext(head.getNext());
    head.getNext().setPrev(temp);
    head.setNext(temp);
    (size)++;
}