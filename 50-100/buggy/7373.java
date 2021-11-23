private java.lang.String absentDirectory() {
    try {
        java.lang.String result = ((existingDirectory()) + (xyz.enhorse.commons.HandyPathTest.name)) + (HandyPath.PATH_SEPARATOR);
        java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get(result));
        return result;
    } catch (java.io.IOException ex) {
        throw new java.lang.IllegalStateException();
    }
}