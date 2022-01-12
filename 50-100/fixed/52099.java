protected void copyFile(java.io.InputStream in, java.io.File targetFile) throws java.io.IOException {
    ensureFolderExists(targetFile);
    final java.io.FileOutputStream out = new java.io.FileOutputStream(targetFile);
    try {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != (-1)) {
            out.write(buffer, 0, len);
        } 
    } finally {
        out.close();
    }
}