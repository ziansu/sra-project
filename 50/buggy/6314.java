public void push(E element) {
    if ((marker) == 0) {
        throw new java.lang.IllegalStateException();
    }else {
        ensureCapacity(1);
        elements[((size)++)] = element;
    }
}