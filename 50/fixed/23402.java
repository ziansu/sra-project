public void addFirst(T value) {
    (head)++;
    if ((head) == (data.length)) {
        head = 0;
    }
    data[head] = value;
    (size)++;
}