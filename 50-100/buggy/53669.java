public void setScreenshotDirectory(java.lang.String screenshotDirectory) throws java.io.IOException {
    if ((this.screenshotDirectory) == null) {
        java.io.File file = new java.io.File(screenshotDirectory);
        if (file.exists()) {
            org.apache.commons.io.FileUtils.cleanDirectory(file);
            file.delete();
            file.mkdir();
        }else {
            file.mkdir();
        }
    }
    this.screenshotDirectory = screenshotDirectory;
}