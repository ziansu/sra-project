public org.structr.web.common.AsyncBuffer append(final java.lang.String s) {
    synchronized(queue) {
        queue.add(s);
    }
    return this;
}