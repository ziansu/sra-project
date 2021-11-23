@org.junit.Test
public void testContentHandlerElement() throws java.lang.Exception {
    org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("namespace", "");
    org.apache.axiom.om.OMElement rootElement = factory.createOMElement("root", namespace, result);
    handler = new org.springframework.ws.soap.axiom.AxiomHandler(rootElement, factory);
    xmlReader.setContentHandler(handler);
    xmlReader.parse(new org.xml.sax.InputSource(new java.io.StringReader(org.springframework.ws.soap.axiom.AxiomHandlerTest.XML_2_SNIPPET)));
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    result.serialize(bos);
    org.custommonkey.xmlunit.XMLAssert.assertXMLEqual("Invalid result", org.springframework.ws.soap.axiom.AxiomHandlerTest.XML_2_EXPECTED, bos.toString("UTF-8"));
}