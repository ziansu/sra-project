public void addFirst(T value) {
    if ((head) == (data.length)) {
        head = 0;
    }
    data[head] = value;
    (head)++;
    if ((size) == 0)
        (tail)++;
    
    (size)++;
}