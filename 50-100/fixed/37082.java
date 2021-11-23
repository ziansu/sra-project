public static java.util.Collection<java.lang.String> listResourcesAt(java.net.URL url) throws java.io.IOException {
    switch (url.getProtocol()) {
        case "jar" :
            return prompto.utils.ResourceUtils.listJarResourcesAt(url);
        case "file" :
            return prompto.utils.ResourceUtils.listFileResourcesAt(url);
        default :
            throw new java.lang.UnsupportedOperationException(("protocol:" + (url.getProtocol())));
    }
}