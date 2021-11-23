private com.dimon.bashorg.core.MyLinkedList<T>.Node<T> getNode(final int num) {
    if (num >= (length())) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    com.dimon.bashorg.core.MyLinkedList<T>.Node<T> search = head;
    int i = 0;
    while ((i < num) && ((search.getNext()) != null)) {
        search = search.getNext();
        i++;
    } 
    return search;
}