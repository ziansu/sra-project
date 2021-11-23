public T pollLast() {
    if (this.isEmpty()) {
        return null;
    }else {
        T retVal = _end.getCargo();
        _end = _end.getPrev();
        _end.setNext(null);
        (_size)--;
        return retVal;
    }
}