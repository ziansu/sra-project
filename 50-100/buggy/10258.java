private void enqueueDownload() {
    java.lang.String url = Data.sampleUrls[1];
    java.lang.String filePath = (com.tonyodev.fetchdemo.Data.getSaveDir()) + "/fragments/smallFile.txt";
    com.tonyodev.fetch.request.Request request = new com.tonyodev.fetch.request.Request(url, filePath);
    downloadId = fetch.enqueue(request);
    if ((downloadId) == (-1)) {
        android.widget.Toast.makeText(this, R.string.enqueue_error, Toast.LENGTH_SHORT).show();
    }
    progressFragment1.setDownloadId(downloadId);
    progressFragment2.setDownloadId(downloadId);
}