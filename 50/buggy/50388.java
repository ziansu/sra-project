public void setCompleteFilePath() {
    filePath = ((filePath) + "/") + (fileName);
    checkFileExists();
}