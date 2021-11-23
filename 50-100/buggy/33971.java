private void complete() {
    status = com.frostwire.android.gui.transfers.YouTubeDownload.STATUS_COMPLETE;
    manager.incrementDownloadsToReview();
    if (completeFile.getAbsoluteFile().exists()) {
        com.frostwire.android.gui.Librarian.instance().scan(getSavePath().getAbsoluteFile());
        java.lang.String sha1 = com.frostwire.android.gui.transfers.Digests.sha1(completeFile);
        com.frostwire.android.gui.services.Engine.instance().notifyDownloadFinished(getDisplayName(), completeFile, sha1);
    }else {
        com.frostwire.android.gui.services.Engine.instance().notifyDownloadFinished(getDisplayName(), getSavePath());
    }
    cleanupIncomplete();
}