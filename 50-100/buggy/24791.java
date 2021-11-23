public static java.lang.String getXmlNodeValue(java.lang.String node, org.w3c.dom.Element element) {
    org.w3c.dom.NodeList nList = element.getElementsByTagName(node).item(0).getChildNodes();
    try {
        org.w3c.dom.Node nValue = nList.item(0);
        return nValue.getNodeValue();
    } catch (java.lang.Exception e) {
        return "";
    }
}