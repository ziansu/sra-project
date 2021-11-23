private int indexOf(T value) {
    MyLinkedList<T>.LNode current = start;
    for (int i = 0; i < (size); i++) {
        if (current.getValue().equals(value)) {
            return i;
        }
        current = current.getNext();
    }
    return -1;
}