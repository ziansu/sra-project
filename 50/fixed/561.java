@java.lang.Override
public int read(byte[] b) throws java.io.IOException {
    int bytes = in.read(b);
    if (bytes > 0)
        count += bytes;
    
    return bytes;
}