private void handleSupportedLanguages(org.openmrs.addonindex.domain.AddOnVersion addOnVersion, javax.xml.xpath.XPath xpath, org.w3c.dom.Document config) throws javax.xml.xpath.XPathExpressionException {
    org.w3c.dom.NodeList nodeList = ((org.w3c.dom.NodeList) (xpath.evaluate("/module/messages/lang", config, javax.xml.xpath.XPathConstants.NODESET)));
    for (int i = 0; i < (nodeList.getLength()); ++i) {
        org.w3c.dom.Node item = nodeList.item(i);
        addOnVersion.addLanguage(item.getTextContent().trim());
    }
}