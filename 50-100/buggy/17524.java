public void enqueue(E newData) {
    if (this.isEmpty()) {
        head.setData(newData);
    }else {
        Node<E> newElement = new Node<E>(newData, null);
        tail.setNext(newElement);
        this.tail = newElement;
    }
}