public void add(cque.INodePool pool, E e) {
    assert e != null;
    cque.Node<E> n = getNode(pool, e);
    if ((tail) == null) {
        assert (head) == null;
        head = n;
        tail = n;
    }
    tail.setNext(n);
    tail = n;
}