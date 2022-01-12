public T removeLast() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    T value = ((T) (data[tail]));
    data[tail] = null;
    (tail)++;
    (size)--;
    return value;
}