public boolean loadResource(java.lang.String path) throws java.io.IOException {
    java.io.InputStream is = null;
    try {
        is = getClass().getResourceAsStream(path);
        if (is != null) {
            load(is);
            return true;
        }
    } finally {
        if (is != null) {
            is.close();
        }
    }
    return false;
}