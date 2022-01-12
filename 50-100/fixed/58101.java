private void copyFile(java.io.InputStream ins, java.io.OutputStream outs) throws java.io.IOException {
    byte[] buffer = new byte[1024];
    int read;
    while ((read = ins.read(buffer)) != (-1)) {
        outs.write(buffer, 0, read);
    } 
}