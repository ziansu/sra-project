public void addFirst(T t) {
    com.shadowxz.LinkedList.Node<T> newNode = new com.shadowxz.LinkedList.Node<T>(t, null, first);
    first.prev = newNode;
    first = newNode;
    (size)++;
}