public boolean isAttic() {
    if ((uri) == null) {
        return false;
    }
    try {
        final java.net.URL url = new java.net.URL(uri.toString());
        return (url.getProtocol().compareToIgnoreCase(xtremweb.communications.Connection.atticScheme())) == 0;
    } catch (final java.lang.Exception e) {
    }
    return false;
}