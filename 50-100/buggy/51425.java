public void executeZip() throws java.io.IOException {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    mkdir();
    teamEleven.zip.Zip.zip(tmpFolderPath, ((this.zipedLogZipPrex) + (format.format(cal.getTime()))));
    java.io.File oriFolder = new java.io.File(this.originLogForder);
    synchronized(oriFolder) {
        org.apache.commons.io.FileUtils.deleteDirectory(oriFolder);
    }
}