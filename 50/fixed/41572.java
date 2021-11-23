private void addFile(java.io.File f) {
    java.nio.file.Path p = java.nio.file.Paths.get(f.toURI());
    list.getItems().add(p);
}