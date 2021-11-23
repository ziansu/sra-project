@java.lang.Override
public java.lang.Object get(int index) {
    if (!(checkIndex(index)))
        return null;
    
    week3.linkedList.MyLinkedList.Node currNode = head;
    for (int i = 0; i < index; i++) {
        currNode = currNode.getNext();
    }
    return currNode.getData();
}