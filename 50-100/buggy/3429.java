public void deleteNodeValue(int value) {
    DataStructuresClasses.LinkNode node = head;
    DataStructuresClasses.LinkNode nodeBack = null;
    if ((node.data) == value) {
        deleteNodeFromBeginning();
    }
    while (((node.data) != value) && ((node.next) != null)) {
        nodeBack = node;
        node = node.next;
    } 
    nodeBack.next = node.next;
    (DataStructuresClasses.LinkedList.length)--;
}