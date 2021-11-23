public boolean removeAt(int index) {
    if (index > (length)) {
        return false;
    }
    if (index == 0) {
        head = head.next;
    }else
        if (index == ((length) - 1)) {
            tail = getNodeAt((index - 1));
            tail.next = null;
        }else {
            SinglyLinkedList.Node<T> curr = head;
            curr = getNodeAt((index = 1));
            curr.next = curr.next.next;
        }
    
    (length)--;
    return true;
}