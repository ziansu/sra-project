private void setCompleteFilePath() {
    filePath = ((filePath) + "/") + (fileName);
    checkFileExists();
}