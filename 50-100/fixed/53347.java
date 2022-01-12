public void setUri(java.net.URI uri) {
    this.uri = uri;
    this.host = this.uri.getHost();
    this.port = this.uri.getPort();
    java.lang.String scheme = this.uri.getScheme();
    if ("https".equals(scheme)) {
        this.secure = true;
    }
}