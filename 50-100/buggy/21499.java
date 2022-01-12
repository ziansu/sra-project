public boolean isAttic() {
    java.net.URL url = null;
    try {
        url = new java.net.URL(uri.toString());
        return (url.getProtocol().compareToIgnoreCase(xtremweb.communications.Connection.atticScheme())) == 0;
    } catch (final java.lang.Exception e) {
    }
    return false;
}