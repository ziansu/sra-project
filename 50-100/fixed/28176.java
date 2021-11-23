@java.lang.Override
public java.net.URI getLocationURI() {
    try {
        java.lang.String id = getPeerNode().getPeerId();
        java.lang.String path = getLocation('/', true);
        return new java.net.URI(org.eclipse.tcf.te.tcf.filesystem.core.internal.url.TcfURLConnection.PROTOCOL_SCHEMA, id, path, null);
    } catch (java.net.URISyntaxException e) {
        assert false;
        return null;
    }
}