public void addLast(T value) {
    if ((size) == (data.length)) {
        grow();
    }
    if ((end) == ((data.length) - 1)) {
        end = 0;
    }else {
        (end)++;
    }
    (size)++;
}