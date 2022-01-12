public void cancel() {
    status = com.github.mob41.osumer.updater.Downloader.CANCELLED;
    reportState();
    java.io.File file = new java.io.File(((((folder) + "\\") + (fileName)) + ".osz"));
    file.delete();
    downloaded = 0;
}