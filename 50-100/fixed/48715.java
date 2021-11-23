public java.lang.String uriStringToString(java.lang.String uri) {
    int sep = uri.lastIndexOf('#');
    if (sep > 0) {
        java.lang.String ns = uri.substring(0, sep);
        java.lang.String ln = uri.substring((sep + 1));
        java.lang.String prefix = configMgr.getGlobalPrefix(ns);
        if ((prefix != null) && ((prefix.length()) > 0)) {
            return (prefix + ":") + ln;
        }
        return ln;
    }
    return uri;
}