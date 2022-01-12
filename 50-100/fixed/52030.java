public void addToFile(java.lang.String path, java.util.List<java.lang.String> toAdd) {
    java.util.List content = this.readFile(path);
    for (int i = 0; i < (toAdd.size()); i++) {
        content.add(toAdd.get(i));
    }
    this.overwriteFile(path, content);
}