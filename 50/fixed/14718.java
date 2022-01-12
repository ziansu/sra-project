public java.io.FileInputStream getFileAsStream() throws java.io.IOException {
    java.io.FileInputStream fis;
    try {
        fis = new java.io.FileInputStream(fileData);
        fis.close();
    } catch (java.io.IOException e) {
        fis = null;
    }
    return fis;
}