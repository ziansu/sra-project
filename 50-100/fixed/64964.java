@org.junit.Test
public void testCreateOU() throws java.lang.Exception {
    de.escidoc.core.resources.oum.OrganizationalUnit ou = de.fiz.escidoc.factory.EscidocObjects.createOrganizationalUnit(("random-ou" + (java.util.UUID.randomUUID())));
    java.lang.String xml = ouMarshaller.marshalDocument(ou);
    assertNotNull(xml);
    assertTrue(((xml.length()) > 0));
    java.lang.System.out.println(xml);
}