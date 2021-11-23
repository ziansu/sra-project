public E peek() {
    if (!(isEmpty())) {
        current = head;
        return current.e;
    }
    return null;
}