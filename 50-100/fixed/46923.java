public void addLast(T val) {
    if (isEmpty()) {
        _last = new DLLNode<T>(val, null, null);
        _first = _last;
        (_size)++;
        return ;
    }
    _last.setNext(new DLLNode<T>(val, _last, null));
    _last = _last.getNext();
    (_size)++;
    return ;
}