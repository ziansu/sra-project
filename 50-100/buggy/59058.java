public E removeLast() {
    Node<E> cursor = this.head;
    Node<E> previous = null;
    while ((cursor.getNext()) != null) {
        previous = cursor;
        cursor = cursor.next();
    } 
    if (previous == null) {
        this.head = null;
    }else {
        previous.setNext(null);
    }
    (this.count)--;
    return cursor.getValue();
}