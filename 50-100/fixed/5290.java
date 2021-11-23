public static <T> void insertNext(com.mdorst.container.list.Node<T> node, com.mdorst.container.list.Node<T> newNode) {
    if ((node == null) || (newNode == null)) {
        throw new java.lang.NullPointerException();
    }
    com.mdorst.container.list.Node<T> temp = node.next;
    node.next = newNode;
    newNode.next = temp;
    newNode.prev = node;
    if (temp != null) {
        temp.prev = newNode;
    }
}