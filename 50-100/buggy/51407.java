public void insertAtBegin(T data) {
    try {
        vistaraka.ananda.dsa.datta.Node<T> node = new vistaraka.ananda.dsa.datta.Node<T>(data);
        node.setLink(head);
        setHead(node);
        setSize(((vistaraka.ananda.dsa.AugmentedLinkedList.getSize()) + 1));
        return ;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}