public T get(int index) {
    if ((head) == null) {
        return null;
    }
    int i = 0;
    linkedlistdiscussion.Node<T> node = head;
    while ((i < index) && ((node.getNext()) != null)) {
        node = node.getNext();
        i++;
    } 
    return node.getValue();
}