private java.util.Properties loadConfig(java.lang.String file) {
    java.util.Properties config = new java.util.Properties();
    java.io.InputStream fis = null;
    try {
        fis = new java.io.FileInputStream(file);
        config.load(fis);
    } catch (java.lang.Exception e) {
        return null;
    } finally {
        try {
            if (fis != null)
                fis.close();
            
        } catch (java.lang.Exception ex) {
        }
    }
    return config;
}