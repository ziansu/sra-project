void startDownload() {
    downloader.startDownload();
    for (int i = 200; i > 1; --i) {
        if (downloader.isStopped()) {
            break;
        }
        downloader.setDaysToDownload(i);
        downloader.startDownload();
    }
}