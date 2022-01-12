private static boolean isUriProtocolSupported(java.net.URI uri, java.util.List<java.lang.String> protocols) {
    if (uri == null) {
        return false;
    }
    for (java.lang.String protocol : protocols) {
        if ((protocol.equalsIgnoreCase(uri.getScheme())) || (protocol.equalsIgnoreCase(uri.toString()))) {
            return true;
        }
    }
    return false;
}