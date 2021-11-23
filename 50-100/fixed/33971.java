private void complete() {
    status = com.frostwire.android.gui.transfers.YouTubeDownload.STATUS_COMPLETE;
    manager.incrementDownloadsToReview();
    if (completeFile.getAbsoluteFile().exists()) {
        com.frostwire.android.gui.Librarian.instance().scan(getSavePath().getAbsoluteFile());
        com.frostwire.android.gui.services.Engine.instance().notifyDownloadFinished(getDisplayName(), completeFile, null);
    }else {
        com.frostwire.android.gui.services.Engine.instance().notifyDownloadFinished(getDisplayName(), getSavePath());
    }
    cleanupIncomplete();
}