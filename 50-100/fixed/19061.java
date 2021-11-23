@java.lang.SuppressWarnings(value = "EmptyStatement")
private void readRemainingBytes() throws java.io.IOException {
    if ((cipherInputStream.available()) <= 0) {
        return ;
    }
    final int bufferSize = calculateBufferSize();
    byte[] buf = new byte[bufferSize];
    while ((read(buf, false)) >= 0);
}