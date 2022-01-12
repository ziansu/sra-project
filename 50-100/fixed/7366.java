public void run() {
    try {
        org.apache.commons.io.FileUtils.touch(temporaryFileDownloadLocation);
        org.apache.commons.io.FileUtils.copyURLToFile(urlToFile, temporaryFileDownloadLocation);
        org.apache.commons.io.FileUtils.copyFile(temporaryFileDownloadLocation, finalFileDownloadFileLocation);
        org.apache.commons.io.FileUtils.forceDelete(temporaryFileDownloadLocation);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}