@org.junit.Test
public void testCheckVariantExistsDoesntExist() throws java.net.URISyntaxException {
    org.junit.Assert.assertFalse(testCheckVariantExistsHelper("20:71821:C:G"));
}