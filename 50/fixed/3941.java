private java.io.File createFolderInFolder(final java.io.File parentFolder, final java.lang.String folderName) {
    java.io.File innerFolder = new java.io.File(parentFolder, folderName);
    return createFolderIfNotExisting(innerFolder);
}