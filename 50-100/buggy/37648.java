public T pollLast() {
    if ((size) == 0) {
        throw new java.lang.IllegalStateException();
    }
    T save = array[end];
    array[end] = null;
    if ((end) == 0) {
        end = (array.length) - 1;
    }else {
        (end)--;
    }
    return save;
}