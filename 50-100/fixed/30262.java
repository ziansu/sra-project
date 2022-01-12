private static java.lang.String readLine(java.io.BufferedInputStream bufferedInputStream) throws java.io.IOException {
    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    int read;
    while (((read = bufferedInputStream.read()) != 0) && (read != '\n')) {
        byteArrayOutputStream.write(read);
    } 
    java.lang.String line = new java.lang.String(byteArrayOutputStream.toByteArray()).trim();
    return line;
}