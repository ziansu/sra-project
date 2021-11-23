public void addLast(T value) {
    if ((tail) < 0) {
        tail = (data.length) - 1;
    }
    data[tail] = value;
    (tail)--;
    if ((size) == 0)
        (head)--;
    
    (size)++;
}