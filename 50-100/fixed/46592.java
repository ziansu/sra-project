private void renameTo(java.lang.String oldName, java.lang.String newName) throws java.io.IOException {
    java.nio.file.Path oldPaper = new java.io.File(papersFolder, oldName).toPath();
    java.nio.file.Path newPaper = new java.io.File(papersFolder, newName).toPath();
    java.nio.file.Files.move(oldPaper, newPaper);
}