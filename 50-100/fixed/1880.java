public int indexOf(java.lang.Object o) {
    int index = 0;
    for (LinkedList<E>.LinkedListNode<E> current = head; current != null; current = current.next) {
        if (o == null) {
            if ((current.element) == null)
                return index;
            
        }else
            if (o.equals(current.element))
                return index;
            
        
        index++;
    }
    return -1;
}