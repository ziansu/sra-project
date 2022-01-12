public T removeFirst() {
    if ((size) < 1) {
        throw new java.util.NoSuchElementException();
    }
    T ret = data[head];
    data[head] = null;
    if (((head) + 1) == (data.length)) {
        head = 0;
    }else {
        head += 1;
    }
    (size)--;
    return ret;
}