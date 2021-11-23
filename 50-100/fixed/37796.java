public void swallowFileContent(java.io.InputStream fis, java.io.PrintStream fos) throws java.io.IOException {
    int n;
    byte[] buffer = new byte[65536];
    while ((n = fis.read(buffer)) != (-1))
        fos.write(buffer, 0, n);
    
}