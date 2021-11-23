long write(java.io.OutputStream out) throws java.io.IOException {
    if (contentType.equals("application/x-macbinary")) {
        out = new com.home.builderforms.MacBinaryDecoderOutputStream(out);
    }
    long size = 0;
    int read;
    byte[] buf = new byte[8 * 1024];
    while ((read = partInput.read(buf)) != (-1)) {
        out.write(buf, 0, read);
        size += read;
    } 
    return size;
}