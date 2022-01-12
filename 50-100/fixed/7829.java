@java.lang.Override
public void run() {
    if (download.needToDownload()) {
        fireTask((((Language.INSTANCE.localize("common.downloading")) + " ") + (download.getFilename())));
        download.download(true);
    }
}