public void loadPropertiesFromFileName(final java.lang.String fileName, final java.lang.ClassLoader cl, final java.util.Properties properties) throws java.io.FileNotFoundException, java.io.IOException {
    final java.io.File file = new java.io.File(fileName);
    if ((file != null) && (file.exists())) {
        try (java.io.InputStream is = new java.io.FileInputStream(file)) {
            properties.load(is);
        }
    }else {
        final java.io.InputStream is = cl.getResourceAsStream(fileName);
        if (is != null) {
            properties.load(is);
        }
    }
}