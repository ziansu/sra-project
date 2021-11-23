public T removeFirst() {
    if ((size) < 1) {
        throw new java.util.NoSuchElementException();
    }
    T ret = data[start];
    data[start] = null;
    if (((start) + 1) == (data.length)) {
        start = 0;
    }else {
        (start)++;
    }
    (size)--;
    return ret;
}