private void itemClicked(int position) {
    com.subscreen.SubDownloader.Result result = results[position];
    if ((downloadTask) != null)
        return ;
    
    downloadTask = new com.subscreen.Search.DownloadTaskRunner();
    ((com.subscreen.Search.DownloadTaskRunner) (downloadTask)).setToDownload(result);
    try {
        downloadTask.execute();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}