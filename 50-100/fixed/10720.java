@org.junit.Test
public void testIssuerName() throws gov.hhs.fha.nhinc.properties.PropertyAccessException {
    final gov.hhs.fha.nhinc.callback.opensaml.CallbackProperties callbackProps = org.mockito.Mockito.mock(gov.hhs.fha.nhinc.callback.opensaml.CallbackProperties.class);
    java.lang.String sIssuer = callbackProps.getIssuer();
    gov.hhs.fha.nhinc.properties.PropertyAccessor propAccessor = createPropertyAccessor();
    sIssuer = propAccessor.getProperty(gov.hhs.fha.nhinc.callback.opensaml.HOKSAMLAssertionBuilderTest.PROPERTY_FILE_NAME, gov.hhs.fha.nhinc.callback.opensaml.HOKSAMLAssertionBuilderTest.PROPERTY_NAME);
    org.junit.Assert.assertEquals(gov.hhs.fha.nhinc.callback.opensaml.HOKSAMLAssertionBuilderTest.PROPERTY_VALUE_STRING, sIssuer);
    sIssuer = sIssuer.replace("%", ",");
}