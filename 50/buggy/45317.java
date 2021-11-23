public void setFileName(java.lang.String fileName) throws java.io.IOException {
    writer.close();
    writer = new java.io.PrintWriter(fileName);
}