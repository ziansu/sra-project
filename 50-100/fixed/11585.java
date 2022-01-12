@org.junit.Test
public void testInvalidNullURI() {
    try {
        java.net.URL url = mastsh.toURL(null);
        org.junit.Assert.fail(("expected IllegalArgumentException, got " + url));
    } catch (java.lang.IllegalArgumentException expected) {
        ca.nrc.cadc.caom2.artifact.resolvers.MastResolverTest.log.info(("IllegalArgumentException thrown as expected. Test passed.: " + expected));
    } catch (java.lang.Exception unexpected) {
        ca.nrc.cadc.caom2.artifact.resolvers.MastResolverTest.log.error("unexpected exception", unexpected);
        org.junit.Assert.fail(("unexpected exception: " + unexpected));
    }
}