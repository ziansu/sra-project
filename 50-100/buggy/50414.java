@java.lang.Override
public void onComplete(com.frostwire.android.gui.transfers.HttpDownload download) {
    downloadAndUpdateCoverArt(download.getSavePath());
    moveFile(download.getSavePath());
    scanFinalFile();
    java.io.File savedFile = getSavePath();
    java.lang.String sha1 = com.frostwire.android.gui.transfers.Digests.sha1(savedFile);
    com.frostwire.android.gui.services.Engine.instance().notifyDownloadFinished(getDisplayName(), savedFile, sha1);
}