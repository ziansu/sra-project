public boolean append(org.eclipse.jetty.http2.HTTP2Flusher.Entry entry) {
    boolean closed;
    synchronized(this) {
        closed = terminated;
        if (!closed) {
            frames.add(entry);
            if (org.eclipse.jetty.http2.HTTP2Flusher.LOG.isDebugEnabled())
                org.eclipse.jetty.http2.HTTP2Flusher.LOG.debug("Appended {}, frames={}", entry, frames.size());
            
        }
    }
    if (closed)
        closed(entry, new java.nio.channels.ClosedChannelException());
    
    return !closed;
}