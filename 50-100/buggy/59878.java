protected void replaceFirstNode(ru.datastructure.ycache.Node<K, V> node) {
    if ((getHead()) == null) {
        setHead(node);
        setTail(node);
    }else {
        getHead().prev = node;
        node.next = getHead();
        setHead(node);
    }
}