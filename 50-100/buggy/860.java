void startDownload() {
    downloader.startDownload();
    for (int i = 200; i > 1; --i) {
        if (downloader.isStopped()) {
            break;
        }
        stsc.news.feedzilla.downloader.FeedzillaDownloadApplication.logger.debug((("We start to download " + i) + " days ago."));
        downloader.setDaysToDownload(i);
        downloader.startDownload();
    }
}