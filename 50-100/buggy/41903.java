public void setTail(com.hit.algorithm.Node<K, V> tail) {
    if ((this.tail) != null) {
        this.tail.setNext(tail);
        tail.setPre(this.tail);
    }
    this.tail = tail;
}