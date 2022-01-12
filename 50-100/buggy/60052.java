private void readRemainingBytes() throws java.io.IOException {
    if ((cipherInputStream.available()) <= 0) {
        return ;
    }
    final int bufferSize = calculateBufferSize();
    byte[] buf = new byte[bufferSize];
    int read;
    while ((read = cipherInputStream.read(buf)) >= 0) {
        hmac.update(buf, 0, read);
    } 
}