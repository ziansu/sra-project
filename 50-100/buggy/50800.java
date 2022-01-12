public void data(com.drew.metadata.mov.QtDataSource source, int length, int index) throws java.io.IOException {
    source.skip(8);
    byte[] buffer = buffer = new byte[length - 16];
    source.read(buffer);
    keyValues[index] = new java.lang.String(buffer);
    java.lang.System.out.println(keyValues[index]);
}