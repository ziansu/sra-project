public void deleteNodeFromPosition(int position) {
    if (position > (DataStructuresClasses.LinkedList.length)) {
        return ;
    }
    DataStructuresClasses.LinkNode node = head;
    DataStructuresClasses.LinkNode nodeBack = null;
    if (position == 1) {
        deleteNodeFromBeginning();
    }
    if (position == (DataStructuresClasses.LinkedList.length)) {
        deleteNodeFromEnd();
    }
    int i = 0;
    while (i != (position - 1)) {
        i++;
        nodeBack = node;
        node = node.next;
    } 
    nodeBack.next = node.next;
    (DataStructuresClasses.LinkedList.length)--;
}