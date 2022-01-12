public void writeFileByteContentAndHash(byte[] bFile, byte[] md5) throws java.io.IOException {
    java.io.FileOutputStream fos = new java.io.FileOutputStream(filePath);
    int a = md5.length;
    fos.write(bFile);
    fos.write(md5);
    fos.write(((byte) (a)));
    fos.close();
    byte[] b = readHash();
}