public void run() {
    int index = anonscanlations.downloader.Downloader.getIndex();
    try {
        anonscanlations.downloader.Downloader.execute(index, c, d);
    } catch (java.lang.Exception e) {
        anonscanlations.downloader.DownloaderUtils.error("Error while running chapter", e, true);
        anonscanlations.downloader.Downloader.status(index, ("Error: " + (e.getLocalizedMessage())));
    }
}