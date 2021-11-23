public static java.util.Collection<java.lang.String> listResourcesAt(java.net.URL url, java.lang.String path) throws java.io.IOException {
    switch (url.getProtocol()) {
        case "jar" :
            return prompto.utils.ResourceUtils.listJarResourcesAt(url, path);
        case "file" :
            return prompto.utils.ResourceUtils.listFileResourcesAt(url, path);
        default :
            throw new java.lang.UnsupportedOperationException(("protocol:" + (url.getProtocol())));
    }
}