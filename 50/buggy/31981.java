public zlc.season.rxdownload.entity.DownloadRange readDownloadRange(java.lang.String url) throws java.io.IOException {
    return mFileHelper.readDownloadRange(getTempFile(url));
}