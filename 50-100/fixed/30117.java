private void removeCopyrightNoticeInJavaFilesForProjectAt(java.nio.file.Path projectDirectory) throws java.io.IOException {
    log(("searching for java files under " + projectDirectory));
    sample.RemoveCopyrightHeaders.FileFinder javaFiles = new sample.RemoveCopyrightHeaders.FileFinder("*.java");
    java.nio.file.Files.walkFileTree(projectDirectory, javaFiles);
    log((("found " + (javaFiles.found.size())) + " java file"));
    javaFiles.found.parallelStream().forEach(this::removeCopyrightNoticeFrom);
}