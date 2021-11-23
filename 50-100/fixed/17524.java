public void enqueue(E newData) {
    if (this.isEmpty()) {
        head = new Node<E>(newData, tail);
        tail = head;
    }else {
        Node<E> newElement = new Node<E>(newData, null);
        tail.setNext(newElement);
        this.tail = newElement;
    }
}