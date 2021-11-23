java.io.InputStream getStream(java.lang.String name) {
    final java.lang.String path = (name.replace(".", "/")) + ".class";
    for (java.nio.file.Path basepath : classpath) {
        try {
            java.nio.file.Path file = basepath.resolve(path);
            if (java.nio.file.Files.exists(file)) {
                return java.nio.file.Files.newInputStream(file);
            }
        } catch (java.io.IOException e) {
        }
    }
    return null;
}