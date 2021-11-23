public void twin() {
    SListNode currentnode = head;
    while (currentnode != null) {
        SListNode copynode = new SListNode(currentnode.item);
        copynode.next = currentnode.next;
        currentnode.next = copynode;
        currentnode = copynode.next;
    } 
}