public void setUri(java.lang.String uri) {
    this.resolvedUri = java.net.URI.create(uri);
    this.host = this.resolvedUri.getHost();
    this.port = this.resolvedUri.getPort();
    java.lang.String scheme = this.resolvedUri.getScheme();
    if ("https".equals(scheme)) {
        this.secure = true;
    }
}