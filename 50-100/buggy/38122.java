public T removeFirst() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    T value = ((T) (data[head]));
    data[head] = null;
    (head)--;
    (size)--;
    return value;
}