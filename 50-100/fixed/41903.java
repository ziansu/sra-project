public void setTail(com.hit.algorithm.Node<K, V> node) {
    if ((this.tail) != null) {
        this.tail.setNext(node);
    }
    if (node != null) {
        node.setPre(this.tail);
    }
    this.tail = node;
}