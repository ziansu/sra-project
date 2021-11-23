protected void insert(com.mdorst.container.list.Node<T> newNode, int index) {
    com.mdorst.container.list.Node<T> node = front;
    for (int i = 0; i < index; i++) {
        if (node != null) {
            node = node.next;
        }else {
            throw new java.lang.IndexOutOfBoundsException();
        }
        com.mdorst.container.list.Node.insertNext(node, newNode);
    }
    (size)++;
}