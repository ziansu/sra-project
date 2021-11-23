public boolean prepend(org.eclipse.jetty.http2.HTTP2Flusher.Entry entry) {
    java.lang.Throwable closed;
    synchronized(this) {
        closed = terminated;
        if (closed == null) {
            frames.add(0, entry);
            if (org.eclipse.jetty.http2.HTTP2Flusher.LOG.isDebugEnabled())
                org.eclipse.jetty.http2.HTTP2Flusher.LOG.debug("Prepended {}, frames={}", entry, frames.size());
            
        }
    }
    if (closed == null)
        return true;
    
    closed(entry, closed);
    return false;
}