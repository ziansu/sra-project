public void setOutFile(java.lang.String s) throws java.io.IOException {
    outFile = new java.io.FileWriter(s);
    fos = new java.io.FileOutputStream(new java.io.File(s));
}