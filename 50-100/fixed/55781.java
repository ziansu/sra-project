private void extract(java.util.zip.ZipInputStream inputStream, java.lang.String input) throws java.io.IOException {
    java.io.BufferedOutputStream outputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(input));
    byte[] bytesToRead = new byte[zipping.Zipper.BUFFER_SIZE];
    int beingRead = 0;
    while ((beingRead = inputStream.read(bytesToRead)) > 0) {
        outputStream.write(bytesToRead, 0, beingRead);
    } 
    outputStream.close();
}