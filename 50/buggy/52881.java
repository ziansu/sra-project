public void addFirst(T value) {
    resize();
    (head)--;
    if ((head) < 0) {
        head += size;
    }
    list[head] = value;
    size += 1;
}