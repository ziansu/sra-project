private synchronized void grow() {
    int newCapacity = (size) * 2;
    newCapacity = (newCapacity > (MAX_SIZE)) ? MAX_SIZE : newCapacity;
    E[] target = ((E[]) (new java.lang.Object[newCapacity]));
    java.lang.System.arraycopy(elements, 0, target, 0, size);
    elements = target;
}