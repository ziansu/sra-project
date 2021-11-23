@org.junit.Test
public void testNestedBeansToSirenEntityProperties() throws java.lang.Exception {
    for (de.escalon.hypermedia.spring.xhtml.beans.Item item : dm.items) {
        de.escalon.hypermedia.spring.siren.SirenEntity entity = new de.escalon.hypermedia.spring.siren.SirenEntity();
        sirenUtils.toSirenEntity(entity, item);
        java.lang.String json = objectMapper.valueToTree(entity).toString();
        org.apache.commons.io.FileUtils.writeStringToFile(new java.io.File("siren.html"), json);
    }
}