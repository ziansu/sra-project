public java.lang.Boolean seedDownloadIndex() {
    try {
        mDownloaderIndex.mergeIndex(mAppIndex, true);
        return true;
    } catch (java.io.IOException e) {
        com.door43.tools.reporting.Logger.w(this.getClass().getName(), "Failed to seed the download index", e);
    }
    return false;
}