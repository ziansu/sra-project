public final void fromString(final java.lang.String value) throws java.net.URISyntaxException {
    if (value == null) {
        throw new java.net.URISyntaxException("string is null", "");
    }
    java.lang.String v = value.replaceAll("&amp;", "&");
    v = v.replaceAll("&", "&amp;");
    try {
        uri = new java.net.URI(v);
        uri.normalize();
    } finally {
        v = null;
    }
}