public org.structr.web.common.AsyncBuffer append(final java.lang.String s) {
    synchronized(queue) {
        if (s != null) {
            queue.add(s);
        }
    }
    return this;
}