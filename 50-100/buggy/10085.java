public T removeLast() {
    checkRange();
    T retVal = _end.getCargo();
    _end = _end.getPrev();
    _end.setNext(null);
    if ((_end) == null) {
        _front = null;
    }
    (_size)--;
    return retVal;
}