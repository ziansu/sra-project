public boolean removeFirst() {
    if (isLinkedListEmpty())
        return false;
    else
        if ((size) == 1) {
            destroy();
            (size)--;
            return true;
        }else {
            datastructures.linkedlist.Node<E> temp = root.getNext();
            root.setNext(null);
            root = temp;
            root.setPrev(null);
            (size)--;
            return true;
        }
    
}