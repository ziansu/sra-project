public java.util.Optional<java.nio.file.Path> findIn(java.util.List<java.nio.file.Path> directories) {
    java.nio.file.Path file = java.nio.file.Paths.get(link.get());
    if ((file.isAbsolute()) || (directories.isEmpty())) {
        return java.util.Optional.of(file);
    }else {
        return org.jabref.model.util.FileHelper.expandFilenameAsPath(link.get(), directories);
    }
}