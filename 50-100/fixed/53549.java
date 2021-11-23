private void extractFile(java.io.InputStream in, java.io.File file) {
    try {
        java.io.OutputStream out = new java.io.FileOutputStream(file);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        } 
        out.close();
        in.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}