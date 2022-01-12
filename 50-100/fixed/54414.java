public T removeFirst() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T ret = ((T) (queue[((++(head)) % (queue.length))]));
    (size)--;
    return ret;
}