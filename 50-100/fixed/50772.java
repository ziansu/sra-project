long write(java.io.OutputStream out) throws java.io.IOException {
    long size = 0;
    int read;
    byte[] buf = new byte[8 * 1024];
    while ((read = partInput.read(buf)) != (-1)) {
        out.write(buf, 0, read);
        size += read;
    } 
    return size;
}