@java.lang.Override
public javax.xml.transform.Source resolve(java.lang.String href, java.lang.String base) throws javax.xml.transform.TransformerException {
    try {
        java.io.ByteArrayInputStream in = org.roda.core.common.RodaURIResolver.cache.get(href);
        return new javax.xml.transform.stream.StreamSource(in);
    } catch (java.util.concurrent.ExecutionException e) {
        throw new javax.xml.transform.TransformerException(("Could not load URI: " + href), e);
    }
}