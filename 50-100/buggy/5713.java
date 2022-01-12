protected void writeResponseStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
    if ((inputStream == null) || (outputStream == null)) {
        return ;
    }
    byte[] buffer = new byte[chunkSize];
    int length = 0;
    while ((length = inputStream.read(buffer)) > 0) {
        outputStream.write(buffer, 0, length);
    } 
}