public T getFirst() {
    if ((first) != (((last) + 1) % (deque.length))) {
        if ((first) > 0) {
            return ((T) (deque[((first) - 1)]));
        }else {
            return ((T) (deque[((deque.length) - 1)]));
        }
    }
    return null;
}