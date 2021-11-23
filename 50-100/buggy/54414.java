public T removeFirst() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T ret = ((T) (queue[(++(head))]));
    (size)--;
    return ret;
}