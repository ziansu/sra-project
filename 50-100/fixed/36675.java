public void addLast(T foo) {
    if (foo == null) {
        throw new java.lang.NullPointerException("Cannot add null elements");
    }
    DLLNode<T> add = new DLLNode(foo, null, null);
    if (isEmpty()) {
        _front = add;
    }else {
        add.setPrev(_end);
        _end.setNext(add);
    }
    _end = add;
    (_size)++;
}