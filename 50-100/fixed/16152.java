@org.junit.Test
public void testContentText() throws java.lang.Exception {
    javax.xml.bind.JAXBContext ctx = javax.xml.bind.JAXBContext.newInstance(net.anzix.jaxrs.atom.Content.class);
    net.anzix.jaxrs.atom.Content content = ((net.anzix.jaxrs.atom.Content) (ctx.createUnmarshaller().unmarshal(new java.io.StringReader(net.anzix.jaxrs.atom.ModelTest.XML))));
    java.lang.System.out.println(content.getText());
}