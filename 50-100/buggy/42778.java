public E removeLast() {
    E retVal = _end.getCargo();
    if ((_size) == 1) {
        _front = null;
        _end = null;
    }else {
        _end = _end.getPrev();
        _front.setNext(null);
    }
    _size -= 1;
    return retVal;
}