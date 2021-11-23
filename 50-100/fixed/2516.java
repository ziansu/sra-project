public void clear() {
    com.shadowxz.LinkedList.Node<T> mark = first;
    while ((mark.next) != null) {
        com.shadowxz.LinkedList.Node<T> markNext = mark.next;
        mark.prev = null;
        mark.next = null;
        mark = markNext;
    } 
    first = null;
    size = 0;
}