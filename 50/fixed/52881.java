public void addFirst(T value) {
    resize();
    (head)--;
    if ((head) < 0) {
        head += list.length;
    }
    list[head] = value;
    size += 1;
}