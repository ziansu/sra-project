private java.io.File absentDirectory() {
    try {
        java.lang.String result = (existingDirectory()) + (xyz.enhorse.commons.HandyPathTest.name);
        java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get(result));
        return new java.io.File(result);
    } catch (java.io.IOException ex) {
        throw new java.lang.IllegalStateException();
    }
}