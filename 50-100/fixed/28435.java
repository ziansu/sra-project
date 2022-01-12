public E get(double index) {
    Node<E> current = front;
    double i = 0;
    while (i < index) {
        current = current.next;
        i++;
    } 
    if ((i >= 0) && (i < (size()))) {
        return current.data;
    }else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}