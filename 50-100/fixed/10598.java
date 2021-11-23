private static java.util.Optional<java.nio.file.Path> expandFilename(java.lang.String filename, java.nio.file.Path directory) {
    java.util.Objects.requireNonNull(filename);
    java.util.Objects.requireNonNull(directory);
    java.nio.file.Path file = java.nio.file.Paths.get(filename);
    if (filename.isEmpty()) {
        return java.util.Optional.of(directory);
    }
    java.nio.file.Path resolvedFile = directory.resolve(file);
    if (java.nio.file.Files.exists(resolvedFile)) {
        return java.util.Optional.of(resolvedFile);
    }else {
        return java.util.Optional.empty();
    }
}