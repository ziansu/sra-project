public com.coolerfall.download.DownloadRequest setUrl(java.lang.String url) {
    if (android.text.TextUtils.isEmpty(url)) {
        throw new java.lang.IllegalArgumentException("url cannot be null");
    }
    if ((!(url.startsWith("http"))) && (url.startsWith("https"))) {
        throw new java.lang.IllegalArgumentException("can only download 'HTTP/HTTPS' url");
    }
    mUrl = url;
    return this;
}