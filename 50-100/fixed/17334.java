public void addFirst(T value) {
    if ((size) == (data.length)) {
        grow();
    }
    if ((start) == 0) {
        start = (data.length) - 1;
    }else {
        (start)--;
    }
    data[start] = value;
    (size)++;
}