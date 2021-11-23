private void createFolderIfNotExisting(final java.io.File folder) {
    if (!(folder.exists())) {
        folder.mkdir();
    }
}