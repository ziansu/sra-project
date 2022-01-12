private boolean isEof() throws java.io.IOException {
    if ((bufferedStream.available()) == 0)
        return true;
    
    byte[] bytes = new byte[16];
    int read = bufferedStream.read(bytes, 0, bytes.length);
    if (read == (-1))
        return true;
    
    bufferedStream.unread(bytes, 0, read);
    return (bufferedStream.available()) == 0;
}