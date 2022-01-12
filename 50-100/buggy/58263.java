public synchronized void detachCallback(final int id, final com.milanix.example.downloader.data.dao.Download.DownloadListener callback) {
    if (com.milanix.example.downloader.service.DownloadService.attachedCallbacks.containsKey(id)) {
        if (!(com.milanix.example.downloader.service.DownloadService.attachedCallbacks.get(id).contains(callback))) {
            com.milanix.example.downloader.service.DownloadService.attachedCallbacks.get(id).remove(callback);
            android.util.Log.d(com.milanix.example.downloader.service.DownloadService.getLogTag(), "Detaching callback");
        }
    }
}