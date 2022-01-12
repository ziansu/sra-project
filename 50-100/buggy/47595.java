public T removeLast() {
    T value = ((T) (list[tail]));
    list[tail] = null;
    (tail)--;
    if ((tail) < 0) {
        tail += size;
    }
    (size)--;
    return value;
}