protected static org.w3c.dom.Document getDocument(final java.io.InputStream in) {
    try {
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        java.lang.System.out.println(in);
        org.w3c.dom.Document document = builder.parse(in);
        return document;
    } catch (javax.xml.parsers.ParserConfigurationException e) {
        e.printStackTrace();
        return null;
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
        return null;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}