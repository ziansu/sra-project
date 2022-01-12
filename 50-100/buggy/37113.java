public T removeFirst() throws java.util.NoSuchElementException {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T oldValue = data[start];
    if ((start) == ((data.length) - 1)) {
        start = 0;
    }else {
        (start)++;
    }
    (size)--;
    return oldValue;
}