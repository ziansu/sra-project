public void addFirst(T value) {
    if ((size) == (d.length)) {
        grow();
    }
    (head)--;
    if ((head) == (-1)) {
        head = (d.length) - 1;
    }
    d[head] = value;
    (size)++;
}