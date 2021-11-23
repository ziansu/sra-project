private synchronized void grow() {
    int newCapacity = (size) * 2;
    newCapacity = ((newCapacity > (MAX_SIZE)) || (newCapacity < (size))) ? MAX_SIZE : newCapacity;
    E[] target = ((E[]) (new java.lang.Object[newCapacity]));
    java.lang.System.arraycopy(elements, 0, target, 0, size);
    elements = target;
}