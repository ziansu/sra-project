public void insertBack(java.lang.Object arg, icse.singlylinkedlist.SinglyLinkedListNode freshNode) {
    freshNode.value = arg;
    freshNode.next.next = null;
    if ((this.header) == null) {
        header.next = freshNode;
    }else {
        icse.singlylinkedlist.icse.singlylinkedlist.SinglyLinkedListNode current;
        current = this.header;
        while ((current.next) == null) {
            arg = current.next;
        } 
        current.next = freshNode;
    }
}