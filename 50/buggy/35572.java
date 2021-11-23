public void addLast(T value) {
    int pos = (tail) - 1;
    data[pos] = value;
    (tail)--;
    (size)++;
}