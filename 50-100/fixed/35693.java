private java.lang.String getDefaultFilePath() {
    java.lang.String filename = (mTimestamp) + ".down";
    int index = mUrl.lastIndexOf(java.io.File.separator);
    if ((index > 0) && ((mUrl.length()) >= index)) {
        filename = mUrl.substring(index);
    }
    return ((com.coolerfall.download.DownloadRequest.DEFAULT_DIR) + (java.io.File.separator)) + filename;
}