public void setDownloadInfo(com.jady.retrofitclient.download.DownloadInfo downloadInfo) {
    this.downloadListener = new java.lang.ref.SoftReference<com.jady.retrofitclient.listener.DownloadFileListener>(downloadInfo.getListener());
    this.downloadInfo = downloadInfo;
}