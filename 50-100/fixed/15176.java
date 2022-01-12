@java.lang.Override
public java.net.URL getLocationURL() {
    try {
        java.lang.String id = getPeerNode().getPeerId();
        java.lang.String path = getLocation(true);
        return new java.net.URL(org.eclipse.tcf.te.tcf.filesystem.core.internal.url.TcfURLConnection.PROTOCOL_SCHEMA, id, path);
    } catch (java.net.MalformedURLException e) {
        assert false;
        return null;
    }
}