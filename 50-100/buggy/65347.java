public void addLast(T value) {
    resize();
    (tail)++;
    if (((tail) != 0) && ((tail) >= (size))) {
        tail -= size;
    }
    list[tail] = value;
    size += 1;
}