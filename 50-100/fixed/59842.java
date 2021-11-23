public void add(T value) {
    lists.LinkedList<T>.Node<T> node = new Node<>();
    node.value = value;
    if ((root) == null) {
        root = node;
    }else {
        tail.next = node;
        tail = tail.next;
    }
    tail = node;
    (size)++;
}