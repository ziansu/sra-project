public void add(T value) {
    io.shikkic.ds.LinkedListNode<T> lastNode = getLastLinkedListNode();
    io.shikkic.ds.LinkedListNode<T> newNode = new io.shikkic.ds.LinkedListNode(value, null);
    (length)++;
    if (lastNode == null) {
        rootNode = newNode;
        return ;
    }
    lastNode.setNext(newNode);
}