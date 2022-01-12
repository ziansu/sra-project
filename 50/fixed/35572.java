public void addLast(T value) {
    (tail)--;
    if ((tail) < 0) {
        tail = (data.length) - 1;
    }
    data[tail] = value;
    (size)++;
}