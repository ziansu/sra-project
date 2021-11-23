@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    checkClosed();
    int bytesReadTotal = readBytes(b, off, len);
    int bytesRead = bytesReadTotal;
    while ((bytesReadTotal < len) && (bytesRead > 0)) {
        bytesRead = read(b, bytesRead, (len - bytesRead));
        bytesReadTotal += bytesRead;
    } 
    return bytesReadTotal;
}