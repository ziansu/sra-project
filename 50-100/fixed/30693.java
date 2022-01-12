public T removeLast() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    T value = ((T) (data[tail]));
    (tail)++;
    (size)--;
    if ((tail) == (data.length))
        tail = 0;
    
    return value;
}