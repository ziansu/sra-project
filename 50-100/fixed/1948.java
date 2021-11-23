@java.lang.Override
public synchronized int read(java.nio.ByteBuffer dst) throws java.io.IOException {
    if (!(this.open))
        throw new java.nio.channels.ClosedChannelException();
    
    final int len = (dst.limit()) - (dst.position());
    final byte[] buffer = new byte[len];
    final int read = this.random.read(buffer);
    if (read > 0)
        dst.put(buffer, 0, read);
    
    return read;
}