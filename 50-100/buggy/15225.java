public void removeLast() {
    structures.DoublyLinkedList<E>.Node<E> current = head;
    if (current == null)
        return ;
    
    while ((current.next) != null) {
        current = current.next;
    } 
    if (current != null) {
        current.previous.next = null;
        (size)--;
    }
    (size)--;
}