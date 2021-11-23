public java.lang.String getListOfElementValue(org.w3c.dom.Element element, java.lang.String tagName) {
    java.lang.String elementValues = new java.lang.String();
    if (element == null) {
        return elementValues;
    }
    org.w3c.dom.NodeList nodeList = element.getElementsByTagName(tagName);
    for (int count = 0; count < (nodeList.getLength()); count++) {
        elementValues += (nodeList.item(count).getTextContent().trim()) + "\n";
    }
    return elementValues;
}