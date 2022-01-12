public void start(java.lang.String url) throws java.net.MalformedURLException {
    com.github.axet.wget.info.DownloadInfo info = new com.github.axet.wget.info.DownloadInfo(new java.net.URL(url));
    info.extract();
    java.lang.String formatedFileSize = com.odm.utility.Utility.getLocalString("progress.info.fileSize.unknown");
    java.lang.Long fileSize = info.getLength();
    if (fileSize != null) {
        formatedFileSize = com.odm.downloader.DownloadStarter.formatFileSize(info.getLength());
    }
    java.lang.String urlFileName = org.apache.commons.io.FilenameUtils.getName(url);
    downloadInfoFrame.open(url, new java.io.File(urlFileName), formatedFileSize);
}