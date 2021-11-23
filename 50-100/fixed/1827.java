public void addLast(T value) {
    if ((size) == (data.length)) {
        grow();
    }
    if ((size) > 0) {
        if ((end) == ((data.length) - 1)) {
            end = 0;
        }else {
            (end)++;
        }
    }
    data[end] = value;
    (size)++;
}