private boolean addNodeToEmptyList(java.lang.Object o) {
    if (isEmpty()) {
        week3.linkedList.MyLinkedList.Node newNode = new week3.linkedList.MyLinkedList.Node(o);
        head = tail = newNode;
        (size)++;
        return true;
    }else
        return false;
    
}