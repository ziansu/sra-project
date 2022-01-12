private java.lang.String getDefaultFilePath() {
    java.lang.String filename = mUrl.substring(mUrl.lastIndexOf(java.io.File.separator));
    if (android.text.TextUtils.isEmpty(filename)) {
        filename = (mTimestamp) + ".down";
    }
    return ((com.coolerfall.download.DownloadRequest.DEFAULT_DIR) + (java.io.File.separator)) + filename;
}