public T removeFirst() {
    T value = ((T) (list[head]));
    list[head] = null;
    (head)++;
    if ((head) >= (size)) {
        head -= size;
    }
    (size)--;
    return value;
}