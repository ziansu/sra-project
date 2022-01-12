@org.junit.Test
public void testCreateContext() throws java.lang.Exception {
    de.escidoc.core.resources.om.context.Context ctx = de.fiz.escidoc.factory.EscidocObjects.createContext(("random-context" + (java.util.UUID.randomUUID())), "invalid-ou-id");
    java.lang.String xml = contextMarshaller.marshalDocument(ctx);
    assertNotNull(xml);
    assertTrue(((xml.length()) > 0));
    java.lang.System.out.println(xml);
}