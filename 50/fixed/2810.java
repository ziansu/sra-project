public java.nio.file.Path getExtractionTarget(java.nio.file.Path tmcRoot) {
    return tmcRoot.resolve(java.nio.file.Paths.get(courseName, name));
}