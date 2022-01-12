public static void addChildElement(java.lang.String parent, java.lang.String child, java.lang.String content, int id) {
    try {
        com.nyleptha.martha.grammer.XMLParser.docBuilder = com.nyleptha.martha.grammer.XMLParser.docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = com.nyleptha.martha.grammer.XMLParser.docBuilder.parse(com.nyleptha.martha.grammer.XMLParser.xmlFile);
        org.w3c.dom.Node parentNode = doc.getElementsByTagName(parent).item(id);
        org.w3c.dom.Element childElement = doc.createElement(child);
        parentNode.appendChild(childElement);
        childElement.setTextContent(content);
        com.nyleptha.martha.grammer.XMLParser.TransformXML(doc);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}