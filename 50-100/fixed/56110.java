public java.lang.String getXmlSystemId() throws java.io.IOException {
    java.lang.ClassLoader tccl = freemarker.ext.jsp.TaglibFactory.tryGetThreadContextClassLoader();
    if (tccl != null) {
        final java.net.URL url = tccl.getResource(resourcePath);
        if (url != null) {
            return url.toExternalForm();
        }
    }
    final java.net.URL url = getClass().getResource(resourcePath);
    return url == null ? null : url.toExternalForm();
}