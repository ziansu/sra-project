public void add(cque.INode e) {
    assert e != null;
    if ((tail) == null) {
        assert (head) == null;
        head = e;
        tail = e;
        return ;
    }
    tail.setNext(e);
    tail = e;
}