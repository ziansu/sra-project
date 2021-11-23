private java.lang.Object readResolve() {
    java.lang.System.out.println("HIIII");
    listenerList = new java.util.LinkedList<>();
    return this;
}