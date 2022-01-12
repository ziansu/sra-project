public void addFirst(T val) {
    if (isEmpty()) {
        _first.setCargo(val);
        _last = _first;
        (_size)++;
        return ;
    }
    _first.setPrev(new DLLNode<T>(val, null, _first));
    _first = DLLDeque.getPrev();
    (_size)++;
    return ;
}