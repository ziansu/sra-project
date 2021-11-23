public T removeFirst() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    T value = ((T) (data[head]));
    (head)--;
    (size)--;
    if ((head) == (-1))
        head = (data.length) - 1;
    
    return value;
}