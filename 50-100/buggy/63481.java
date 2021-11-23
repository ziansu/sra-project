public T removeLast() throws java.util.NoSuchElementException {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T oldValue = data[end];
    if ((end) == 0) {
        end = (data.length) - 1;
    }else {
        (end)--;
    }
    (size)--;
    return oldValue;
}