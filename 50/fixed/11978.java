@java.lang.Override
public java.lang.Long getProgress() {
    java.util.Optional<io.github.lumue.getdown.core.download.downloader.DownloadProgress> downloadProgress = download.getDownloadProgress();
    if (!(downloadProgress.isPresent()))
        return 1L;
    
    return downloadProgress.get().getDownloadedSize();
}