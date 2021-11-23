@java.lang.Override
public boolean contains(java.lang.Object o) {
    for (linkedlist.SimpleLinkedList<E>.Node<E> current = head; (current.next) != (head); current = current.next) {
        if (o == null) {
            if ((current.element) == null) {
                return true;
            }
        }else
            if (current.element.equals(o)) {
                return true;
            }
        
    }
    return false;
}