public void remove(int index) {
    if (((head) == null) || (indexIsOutOfBounds(index)))
        return ;
    
    cbeaton.SinglyLinkedList<T>.Node<T> n = head;
    if (index == 0) {
        n = n.next;
        head.next = null;
        head = n;
    }else {
        int i = 0;
        while ((i++) < (index - 1)) {
            n = n.next;
        } 
        n.next = n.next.next;
    }
    (length)--;
}