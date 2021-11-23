public boolean isReadyToDownload() {
    synchronized(this) {
        return (isClientReadyToDownload()) && (isDownloadManagerReadyToDownload());
    }
}