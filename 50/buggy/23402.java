public void addFirst(T value) {
    int pos = (head) + 1;
    data[pos] = value;
    (head)++;
    if ((size) == 0)
        (tail)++;
    
    (size)++;
}