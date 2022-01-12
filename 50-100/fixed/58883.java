public java.lang.Object remove() {
    while ((count) == 0);
    java.lang.Object item;
    --(count);
    item = buffer[out];
    out = ((out) + 1) % (BoundedBuffer.BUFFER_SIZE);
    if ((count) == 0) {
        java.lang.System.out.println(" Buffer EMPTY");
    }
    return item;
}