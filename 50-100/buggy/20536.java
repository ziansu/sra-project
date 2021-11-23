public static void writeProperties(final java.util.Properties properties, final java.io.File file) throws java.io.IOException {
    if ((file.exists()) && (!(file.canWrite()))) {
        throw new java.io.IOException(("Could not write to properties file: " + file));
    }
    final java.io.FileOutputStream stream = new java.io.FileOutputStream(file);
    properties.store(stream, null);
    stream.flush();
    stream.close();
}