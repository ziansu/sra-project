private void addFile(java.io.File f) {
    java.nio.file.Path p = java.nio.file.Paths.get(f.toURI());
    man.attr.put(p, new java.util.HashMap<>());
    list.getItems().add(p);
}