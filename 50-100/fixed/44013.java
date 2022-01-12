private java.util.List<org.openide.filesystems.FileObject> getPluignDirectories() {
    org.openide.filesystems.FileObject rootDirectory = getRootDirectory();
    if (rootDirectory == null) {
        return java.util.Collections.emptyList();
    }
    org.openide.filesystems.FileObject defaultPlugins = rootDirectory.getFileObject("plugins");
    if (defaultPlugins != null) {
        return java.util.Collections.singletonList(defaultPlugins);
    }
    return java.util.Collections.emptyList();
}