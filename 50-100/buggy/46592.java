private static void renameTo(java.lang.String oldName, java.lang.String newName) throws java.io.IOException {
    java.io.File papersFolder = Settings.getFolderPath().toFile();
    java.nio.file.Path oldPaper = new java.io.File(papersFolder, oldName).toPath();
    java.nio.file.Path newPaper = new java.io.File(papersFolder, newName).toPath();
    java.nio.file.Files.move(oldPaper, newPaper);
}