public T pollFirst() {
    if ((size) == 0) {
        throw new java.lang.IllegalStateException();
    }
    T save = array[start];
    array[start] = null;
    if ((start) == ((array.length) - 1)) {
        start = 0;
    }else {
        (start)++;
    }
    return save;
}