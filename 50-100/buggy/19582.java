@java.lang.Override
public week3.linkedList.MyLinkedList.Node get(int index) {
    if (!(checkIndex(index)))
        return null;
    
    week3.linkedList.MyLinkedList.Node currNode = head;
    for (int i = 0; i < index; i++) {
        currNode = currNode.getNext();
    }
    return currNode;
}