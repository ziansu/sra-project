private boolean isEof() throws java.io.IOException {
    if ((bufferedStream.available()) == 0)
        return true;
    
    byte[] bytes = new byte[16];
    int read = bufferedStream.read(bytes, 0, bytes.length);
    bufferedStream.unread(bytes, 0, read);
    return (bufferedStream.available()) == 0;
}