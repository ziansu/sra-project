public void addLast(T value) {
    resize();
    (tail)++;
    if (((tail) != 0) && ((tail) >= (list.length))) {
        tail -= list.length;
    }
    list[tail] = value;
    size += 1;
}