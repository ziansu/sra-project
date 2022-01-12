public void remove(java.lang.Object o) {
    LinkedList<E>.LinkedListNode<E> current = head;
    if (o == null) {
        while ((current != null) && ((current.element) != null)) {
            current = current.next;
        } 
    }else {
        while ((current != null) && (!(o.equals(current.element)))) {
            current = current.next;
        } 
    }
    removeHelper(current);
}