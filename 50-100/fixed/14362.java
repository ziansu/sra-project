private static void activateISUserScipt() throws java.io.IOException {
    if (java.nio.file.Files.exists(java.nio.file.Paths.get(FileActions.activeUserScript.getAbsolutePath()))) {
        java.lang.System.out.println("Backing up user script file");
        FilesAndPaths.etwUserScript = new java.io.File(((FilesAndPaths.modPath) + "/user.empire_script-backup.txt"));
        org.apache.commons.io.FileUtils.copyFile(FileActions.activeUserScript, FilesAndPaths.etwUserScript);
    }
    java.lang.System.out.println("Copying user script file");
    FilesAndPaths.impSplenUserScript = new java.io.File((((FilesAndPaths.modPath) + "/") + (FilesAndPaths.impSplenUserScript.getName())));
    org.apache.commons.io.FileUtils.copyFile(FilesAndPaths.impSplenUserScript, FileActions.activeUserScript);
}