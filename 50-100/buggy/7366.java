public void run() {
    try {
        org.apache.commons.io.FileUtils.touch(temporaryFileDownloadLocation);
        edu.pitt.apollo.filestoreservice.threads.FileDownloadMonitor fileDownloadMonitor = new edu.pitt.apollo.filestoreservice.threads.FileDownloadMonitor(temporaryFileDownloadLocation);
        fileDownloadMonitor.start();
        org.apache.commons.io.FileUtils.copyURLToFile(urlToFile, temporaryFileDownloadLocation);
        org.apache.commons.io.FileUtils.copyFile(temporaryFileDownloadLocation, finalFileDownloadFileLocation);
        org.apache.commons.io.FileUtils.forceDelete(temporaryFileDownloadLocation);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}