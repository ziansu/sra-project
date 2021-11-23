private static boolean isUriProtocolSupported(java.net.URI uri, java.util.List<java.lang.String> protocols) {
    if (uri == null) {
        return false;
    }
    for (java.lang.String protocol : protocols) {
        if (org.apache.commons.lang3.StringUtils.equalsIgnoreCase(protocol, uri.getScheme())) {
            return true;
        }
    }
    return false;
}