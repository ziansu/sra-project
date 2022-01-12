public void loadResource(java.lang.String path) throws java.io.IOException {
    java.io.InputStream is = null;
    try {
        is = getClass().getResourceAsStream(path);
        load(is);
    } finally {
        if (is != null)
            is.close();
        
    }
}