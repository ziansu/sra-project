@org.junit.Test
public void testConstructorNull() throws java.net.MalformedURLException {
    try {
        new net.ontopia.infoset.impl.basic.URILocator(((java.lang.String) (null)));
        org.junit.Assert.fail("URILocator accepted null argument to constructor");
    } catch (java.lang.NullPointerException e) {
    }
}