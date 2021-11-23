public void deleteNodeValue(int value) {
    DataStructuresClasses.LinkNode node = head;
    DataStructuresClasses.LinkNode nodeBack = null;
    if ((head) == null) {
        return ;
    }
    if ((node.data) == value) {
        deleteNodeFromBeginning();
    }
    while ((node != null) && ((node.data) != value)) {
        nodeBack = node;
        node = node.next;
    } 
    if (node != null) {
        nodeBack.next = node.next;
        (DataStructuresClasses.LinkedList.length)--;
    }
}