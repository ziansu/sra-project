public void delete(int node) {
    if ((head) == null) {
        return ;
    }
    if ((head.getValue()) == node) {
        head = head.next;
        refreshTail();
    }else {
        basic.linkedlist.LinkedList.LinkedListNode n = head;
        while ((n.next) != null) {
            if ((n.next.getValue()) == node) {
                n.next = n.next.next;
                refreshTail();
                break;
            }
        } 
    }
    (length)--;
}