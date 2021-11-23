private T removeFirst() {
    if ((start) == (end)) {
        throw new java.util.NoSuchElementException();
    }
    T result = data[start];
    data[start] = null;
    (start)++;
    return result;
}