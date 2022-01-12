@java.lang.Override
public java.net.URL getLocationURL() {
    try {
        java.lang.String id = getPeerNode().getPeerId();
        java.lang.String path = getLocation(true);
        java.lang.String location = (((org.eclipse.tcf.te.tcf.filesystem.core.internal.url.TcfURLConnection.PROTOCOL_SCHEMA) + ":/") + id) + (path.startsWith("/") ? path : "/" + path);
        return new java.net.URL(location);
    } catch (java.net.MalformedURLException e) {
        assert false;
        return null;
    }
}