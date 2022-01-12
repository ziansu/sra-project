public void addFirst(T value) {
    (head)++;
    if ((size) == 0)
        (tail)++;
    
    if ((head) == (data.length)) {
        head = 0;
    }
    data[head] = value;
    (size)++;
}