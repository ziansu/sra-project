private void writeDataFileWithEncryption(java.lang.String url, byte[] content, java.io.File dstFile) throws java.io.IOException {
    dstFile.createNewFile();
    java.io.FileOutputStream fos = new java.io.FileOutputStream(dstFile.getAbsolutePath());
    java.lang.String overallContent = (url + "\n") + (new java.lang.String(content));
    fos.write(overallContent.getBytes());
    fos.close();
}