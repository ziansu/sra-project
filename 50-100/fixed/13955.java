@org.junit.Test
public void testInvalidURIBadScheme() {
    try {
        java.net.URI uri = new java.net.URI(INVALID_URI_BAD_SCHEME);
        java.net.URL url = mastsh.toURL(uri);
        org.junit.Assert.fail(("expected IllegalArgumentException, got " + url));
    } catch (java.lang.IllegalArgumentException expected) {
        ca.nrc.cadc.caom2.artifact.resolvers.MastResolverTest.log.info(("IllegalArgumentException thrown as expected. Test passed.: " + expected));
    } catch (java.lang.Exception unexpected) {
        ca.nrc.cadc.caom2.artifact.resolvers.MastResolverTest.log.error("unexpected exception", unexpected);
        org.junit.Assert.fail(("unexpected exception: " + unexpected));
    }
}