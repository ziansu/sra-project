private java.io.File tempFile(java.lang.String fileName, java.io.File dir) throws java.io.IOException {
    java.io.File temp = new java.io.File(((dir + "/") + fileName));
    java.lang.System.out.println(("Temp file name: " + (temp.getPath())));
    temp.deleteOnExit();
    temp.createNewFile();
    if (!(temp.exists())) {
        throw new java.io.IOException("Temp file does not exist.");
    }
    return temp;
}