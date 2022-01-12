private java.io.InputStream findResource(final java.lang.String path) throws java.lang.Exception {
    if ((this.resourceLocator) == null) {
        return null;
    }
    final java.lang.String resourcePath = "/web" + (path.startsWith("/") ? path : "/" + path);
    final java.net.URL url = this.resourceLocator.findResource(resourcePath);
    if (url == null) {
        return null;
    }
    return url.openStream();
}