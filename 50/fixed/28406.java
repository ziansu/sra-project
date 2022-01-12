public synchronized java.io.InputStream getInputStream() throws java.io.IOException {
    if ((inputStream) != null) {
        return inputStream;
    }else {
        return inputStream = new java.io.FileInputStream(multibody.getFile());
    }
}