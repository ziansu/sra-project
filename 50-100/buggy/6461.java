@java.lang.Override
public java.lang.String apply(java.io.InputStream is) throws java.io.IOException {
    if ((is == null) || ((is.available()) == 0)) {
        return null;
    }
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    byte[] buf = new byte[1024];
    int read;
    while ((read = is.read(buf)) != (-1)) {
        baos.write(buf, 0, read);
    } 
    return baos.toString("UTF-8");
}