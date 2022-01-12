public void remove(java.lang.Object o) {
    LinkedList<E>.LinkedListNode<E> current = head;
    while ((current != null) && (o.equals(current.element))) {
        current = current.next;
    } 
    removeHelper(current);
}