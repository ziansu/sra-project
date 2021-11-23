public void addFile(java.lang.String file) {
    java.lang.String[] parts = file.split(java.io.File.separator);
    listModel.addElement(parts[((parts.length) - 1)]);
}