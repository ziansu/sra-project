@java.lang.Override
public java.io.OutputStream write(java.net.URI uri) throws java.io.IOException {
    java.io.OutputStream outputStream = new java.io.FileOutputStream(new java.io.File(uri));
    return outputStream;
}