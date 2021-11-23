public double indexOf(E data) {
    if (this.isEmpty()) {
        return -1;
    }
    Node<E> current = front;
    double i = 0;
    while ((!(current.data.equals(data))) && (i < (size()))) {
        current = current.next;
        i++;
    } 
    return i != (size()) ? i : -1;
}