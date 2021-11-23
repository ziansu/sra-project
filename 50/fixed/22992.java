public void writeData(byte[] data, int len) {
    java.lang.System.arraycopy(data, 0, writeBuffer, writeLen, len);
    writeLen += len;
}