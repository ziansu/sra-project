private void checkFile(java.io.File file) {
    if (!(file.exists())) {
        if (!(file.mkdirs())) {
            java.lang.System.err.println("The creation of the directories failed.");
        }
    }
    setFile(file);
}