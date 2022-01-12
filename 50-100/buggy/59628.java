public void loadPropertiesFromFileName(final java.lang.String fileName, final java.lang.ClassLoader cl, final java.util.Properties properties) throws java.io.FileNotFoundException, java.io.IOException {
    final java.io.File d = new java.io.File(fileName);
    if ((d != null) && (d.exists())) {
        properties.load(new java.io.FileInputStream(d));
    }else {
        final java.io.InputStream is = cl.getResourceAsStream(fileName);
        if (is != null) {
            properties.load(is);
        }
    }
}