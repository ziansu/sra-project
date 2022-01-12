public void window(org.eclipse.jetty.http2.IStream stream, org.eclipse.jetty.http2.frames.WindowUpdateFrame frame) {
    java.lang.Throwable closed;
    synchronized(this) {
        closed = terminated;
        if (closed == null)
            windows.offer(new org.eclipse.jetty.http2.HTTP2Flusher.WindowEntry(stream, frame));
        
    }
    if (closed == null)
        iterate();
    
}