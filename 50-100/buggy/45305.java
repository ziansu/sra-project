@org.junit.Test
public void defaultType() throws java.lang.Exception {
    org.junit.Assert.assertEquals(java.lang.Byte.class, instance.getDefaultType());
    org.apache.olingo.commons.api.edm.EdmEnumType instance = new org.apache.olingo.commons.core.edm.EdmEnumTypeImpl(org.mockito.Mockito.mock(org.apache.olingo.commons.api.edm.Edm.class), new org.apache.olingo.commons.api.edm.FullQualifiedName("testNamespace", "testName"), new org.apache.olingo.commons.api.edm.provider.CsdlEnumType().setName("MyEnum"));
    org.junit.Assert.assertEquals(java.lang.Integer.class, instance.getUnderlyingType().getDefaultType());
}