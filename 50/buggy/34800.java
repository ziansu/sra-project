public void open() throws java.io.IOException {
    if ((stagedRenameWriter) != null) {
        stagedRenameWriter = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(java.lang.System.getProperty("user.dir"), "stagedrenames.txt"), true)));
    }
}