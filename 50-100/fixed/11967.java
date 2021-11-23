public T removeLast() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }
    T ret = ((T) (queue[((--(tail)) % (queue.length))]));
    (size)--;
    return ret;
}