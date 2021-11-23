public T pollLast() {
    if ((size) == 0) {
        return null;
    }
    T save = array[end];
    array[end] = null;
    if ((end) == 0) {
        end = (array.length) - 1;
    }else {
        (end)--;
    }
    (size)--;
    return save;
}