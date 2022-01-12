public T removeFirst() {
    if (isEmpty()) {
        throw new java.lang.IndexOutOfBoundsException("There is no element to remove");
    }
    T temp = _first.getCargo();
    _first = _first.getNext();
    (_size)--;
    return temp;
}