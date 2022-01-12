public void clear() {
    LinkedList<E>.LinkedListNode<E> current;
    LinkedList<E>.LinkedListNode<E> next;
    next = head;
    while (next != null) {
        current = next;
        next = current.next;
        current.destroy();
    } 
    head = tail = null;
}