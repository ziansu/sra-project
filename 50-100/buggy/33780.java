@org.junit.Test
public void testCreatItem2() throws java.lang.Exception {
    de.escidoc.core.resources.om.item.Item item = de.fiz.escidoc.factory.EscidocObjects.createItem("invalid-context-id", "invalid-content-model-id");
    java.lang.String xml = itemMarshaller.marshalDocument(item);
    org.junit.Assert.assertNotNull(xml);
    org.junit.Assert.assertTrue(((xml.length()) > 0));
    java.lang.System.out.println(xml);
}