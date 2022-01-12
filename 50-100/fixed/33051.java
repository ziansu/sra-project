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
    if (i == index) {
        return node.getValue();
    }else {
        return null;
    }
}