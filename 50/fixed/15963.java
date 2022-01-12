public void removeDownloadListener(git.dzc.downloadmanagerlib.download.DownloadTaskListener listener) {
    if (listener != null) {
        listeners.remove(listener);
    }
}