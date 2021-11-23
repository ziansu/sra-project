public void window(org.eclipse.jetty.http2.IStream stream, org.eclipse.jetty.http2.frames.WindowUpdateFrame frame) {
    boolean closed;
    synchronized(this) {
        closed = terminated;
        if (!closed)
            windows.offer(new org.eclipse.jetty.http2.HTTP2Flusher.WindowEntry(stream, frame));
        
    }
    if (!closed)
        iterate();
    
}