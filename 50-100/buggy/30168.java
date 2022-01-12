public void addLast(T value) {
    if (((size) + 1) > (d.length)) {
        grow();
    }
    if ((tail) >= (d.length)) {
        tail = 0;
    }else {
        (tail)++;
    }
    d[tail] = value;
    (size)++;
}