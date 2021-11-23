private void initialize(E e) {
    me.algoli.list.LinkedList.Node<E> node = me.algoli.list.LinkedList.Node.create(e);
    this.head = node;
    this.tail = node;
}