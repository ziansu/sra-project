public T get(int index) {
    if ((index < 0) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException("Index out of bound");
    }else {
        MyLinkedList<T>.LNode current = start;
        for (int i = 0; i < (size); i++) {
            if (i == index) {
                return current.getValue();
            }
            current = current.getNext();
        }
    }
    return null;
}