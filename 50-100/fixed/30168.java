public void addLast(T value) {
    if ((size) == (d.length)) {
        grow();
    }
    (tail)++;
    if ((tail) == (d.length)) {
        tail = 0;
    }
    d[tail] = value;
    (size)++;
}