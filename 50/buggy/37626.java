private void addToFolderpaths(java.nio.file.Path folder) {
    folderPaths.add(renameFolder(folder.toString()));
    folderPaths.sort(null);
}