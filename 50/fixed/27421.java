@java.lang.Override
public synchronized int read(byte[] b, int offset, int count) {
    if (count >= 21)
        return super.read(b, offset, 21);
    else
        return super.read(b, offset, count);
    
}