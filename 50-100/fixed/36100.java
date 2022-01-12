public T removeFirst() {
    T value = ((T) (list[head]));
    list[head] = null;
    (head)++;
    if ((head) >= (list.length)) {
        head -= list.length;
    }
    (size)--;
    return value;
}