private javax.xml.transform.Source urlSource(final java.lang.String path) throws javax.xml.transform.TransformerException {
    try {
        final java.net.URL url = new java.net.URL(path);
        return new javax.xml.transform.stream.StreamSource(url.openStream());
    } catch (final java.io.IOException e) {
        throw new javax.xml.transform.TransformerException(e.getMessage(), e);
    }
}