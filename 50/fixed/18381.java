public void write(java.io.InputStream is, java.lang.String path) throws java.io.IOException {
    byte[] bytes = org.apache.commons.io.IOUtils.toByteArray(is);
    write(bytes, path);
}