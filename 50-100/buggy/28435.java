public void set(double index, E data1) {
    if (index > (size())) {
        throw new java.lang.IndexOutOfBoundsException("Error: Index cannot be greater than length of list");
    }
    Node<E> current = front;
    for (double i = 0; i < index; i++) {
        current = current.next;
    }
    current.data = data1;
}