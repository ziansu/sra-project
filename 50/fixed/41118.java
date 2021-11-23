@org.testng.annotations.Test(expectedExceptions = java.lang.UnsupportedOperationException.class)
public void testGetAttributeValues() throws java.lang.Exception {
    authenticationContextAttributePIP.getAttributeValues("a", "b", "c", "d", "e", "f");
}