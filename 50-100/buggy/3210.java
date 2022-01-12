private void downloadLyric(java.lang.String url, java.lang.String name) throws java.lang.Exception {
    com.yolanda.nohttp.download.DownloadRequest request = com.yolanda.nohttp.NoHttp.createDownloadRequest(url, RequestMethod.GET, Constants.lyricPath, name, false, false);
    com.yolanda.nohttp.download.DownloadQueue downloadQueue = com.yolanda.nohttp.NoHttp.newDownloadQueue();
    downloadQueue.add(0, request, downloadListener);
}