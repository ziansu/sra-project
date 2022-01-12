protected java.lang.String getType(java.io.File file) {
    if (file.isDirectory()) {
        return "Folder";
    }
    java.lang.String extension = getExtension(file);
    if (extension != null) {
        return extension.toLowerCase();
    }
    return "File";
}