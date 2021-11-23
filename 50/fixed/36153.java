protected void writeValue(java.lang.String s) throws java.io.IOException {
    byte[] data = s.getBytes();
    writeSize(data.length);
    os.write(data);
    os.flush();
}