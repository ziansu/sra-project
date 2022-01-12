private static java.lang.String readFile(java.lang.String path) throws java.io.IOException {
    java.io.File file = new java.io.File(path);
    java.lang.String ret = null;
    if (file.exists()) {
        java.io.FileInputStream fis = null;
        try {
            fis = new java.io.FileInputStream(file);
            byte[] readBytes = new byte[fis.available()];
            fis.read(readBytes);
            ret = new java.lang.String(readBytes);
        } finally {
            if (fis != null)
                fis.close();
            
        }
    }
    return ret;
}