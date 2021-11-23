public T removeLast() {
    checkRange();
    T retVal = _end.getCargo();
    _end = _end.getPrev();
    if ((_end) == null) {
        _front = null;
    }else {
        _end.setNext(null);
    }
    (_size)--;
    return retVal;
}