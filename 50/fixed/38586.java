private java.lang.Object readResolve() {
    listenerList = new java.util.LinkedList<>();
    return this;
}