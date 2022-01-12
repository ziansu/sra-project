@org.junit.Test
public void testGetEdmAssociation() {
    org.junit.Assert.assertNotNull(objAssociation.getEdmAssociation());
    org.junit.Assert.assertEquals(org.apache.olingo.odata2.jpa.processor.core.model.JPAEdmAssociationTest.ASSOCIATION_NAME, objAssociation.getEdmAssociation().getName());
}