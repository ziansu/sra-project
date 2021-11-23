private static java.nio.file.Path fileToPath(final java.io.File file) {
    try {
        return file.toPath();
    } catch (java.lang.Exception ex) {
        return xyz.enhorse.commons.HandyPath.DEFAULT_PATH;
    }
}