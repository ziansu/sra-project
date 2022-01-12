public static void readProperties(final java.util.Properties properties, final java.io.File file) throws java.io.IOException {
    java.util.Objects.requireNonNull(properties);
    java.util.Objects.requireNonNull(file);
    if ((!(file.exists())) && (!(file.createNewFile()))) {
        throw new java.io.IOException(("Could not read from properties file: " + file));
    }
    final java.io.InputStream input = new java.io.FileInputStream(file);
    if (file.canRead()) {
        properties.load(input);
    }
}