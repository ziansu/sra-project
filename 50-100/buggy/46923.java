public void addLast(T val) {
    if (isEmpty()) {
        _last.setCargo(val);
        _first = _last;
        (_size)++;
        return ;
    }
    _last.setNext(new DLLNode<T>(val, _last, null));
    _last = _last.getNext();
    (_size)++;
    return ;
}