public void insertAtBegin(T data) {
    try {
        vistaraka.ananda.dsa.datta.Node<T> node = new vistaraka.ananda.dsa.datta.Node<T>(data);
        node.setLink(head);
        head = node;
        (size)++;
        return ;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}