public static byte[] read(java.lang.String filePath) throws java.lang.Exception {
    java.io.FileInputStream is = null;
    try {
        is = new java.io.FileInputStream(filePath);
        return com.simon.lib.cacheloader.util.IOUtils.read(is);
    } finally {
        if (is != null) {
            try {
                is.close();
            } catch (java.io.IOException e) {
            }
        }
    }
}