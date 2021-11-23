public T pollFirst() {
    if ((size) == 0) {
        return null;
    }
    T save = array[start];
    array[start] = null;
    if ((start) == ((array.length) - 1)) {
        start = 0;
    }else {
        (start)++;
    }
    (size)--;
    return save;
}