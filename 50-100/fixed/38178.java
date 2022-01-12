public static org.w3c.dom.Element createXMLDocument() {
    try {
        javax.xml.parsers.DocumentBuilderFactory docFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder docBuilder;
        docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.newDocument();
        org.w3c.dom.Element rootElement = doc.createElement("root");
        doc.appendChild(rootElement);
        return rootElement;
    } catch (javax.xml.parsers.ParserConfigurationException e) {
        e.printStackTrace();
    }
    return null;
}