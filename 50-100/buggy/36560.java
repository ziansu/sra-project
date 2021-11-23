private java.lang.String getXSDModel(java.lang.String filename) throws java.lang.Exception {
    java.io.InputStream is = getClass().getResourceAsStream(filename);
    assertNotNull(is);
    javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
    javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
    org.w3c.dom.Document doc = builder.parse(is);
    java.lang.String XSDModel = com.amalto.webapp.core.util.Util.nodeToString(doc);
    return XSDModel;
}