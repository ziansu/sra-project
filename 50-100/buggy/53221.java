public boolean prepend(org.eclipse.jetty.http2.HTTP2Flusher.Entry entry) {
    boolean closed;
    synchronized(this) {
        closed = terminated;
        if (!closed) {
            frames.add(0, entry);
            if (org.eclipse.jetty.http2.HTTP2Flusher.LOG.isDebugEnabled())
                org.eclipse.jetty.http2.HTTP2Flusher.LOG.debug("Prepended {}, frames={}", entry, frames.size());
            
        }
    }
    if (closed)
        closed(entry, new java.nio.channels.ClosedChannelException());
    
    return !closed;
}