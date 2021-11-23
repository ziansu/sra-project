public final void fromString(final java.lang.String value) throws java.net.URISyntaxException {
    if (value == null) {
        throw new java.net.URISyntaxException("string is null", "");
    }
    final java.lang.String v = value.replaceAll("&amp;", "&");
    uri = new java.net.URI(v.replaceAll("&", "&amp;"));
    uri.normalize();
}