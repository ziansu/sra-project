public double indexOf(E data) {
    Node<E> current = front;
    double i = 0;
    while ((!(current.data.equals(data))) && (i < (size()))) {
        current = current.next;
        i++;
    } 
    return i != (size()) ? i : -1;
}