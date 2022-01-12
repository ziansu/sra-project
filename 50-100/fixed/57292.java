public void addFirst(T val) {
    if (isEmpty()) {
        _first = new DLLNode<T>(val, null, null);
        _last = _first;
        (_size)++;
        return ;
    }
    _first.setPrev(new DLLNode<T>(val, null, _first));
    _first = _first.getPrev();
    (_size)++;
    return ;
}