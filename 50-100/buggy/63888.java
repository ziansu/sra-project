public java.nio.ByteBuffer waitForOutput(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    java.nio.ByteBuffer b;
    try (org.eclipse.jetty.util.thread.Locker.Lock lock = _locker.lock()) {
        if (((org.eclipse.jetty.util.BufferUtil.isEmpty(_out)) && (!(_closed))) && (!(_oshut)))
            _hasOutput.await(time, unit);
        
        b = _out;
        _out = org.eclipse.jetty.util.BufferUtil.allocate(b.capacity());
    }
    getWriteFlusher().completeWrite();
    return b;
}