public boolean append(org.eclipse.jetty.http2.HTTP2Flusher.Entry entry) {
    java.lang.Throwable closed;
    synchronized(this) {
        closed = terminated;
        if (closed == null) {
            frames.add(entry);
            if (org.eclipse.jetty.http2.HTTP2Flusher.LOG.isDebugEnabled())
                org.eclipse.jetty.http2.HTTP2Flusher.LOG.debug("Appended {}, frames={}", entry, frames.size());
            
        }
    }
    if (closed == null)
        return true;
    
    closed(entry, closed);
    return false;
}