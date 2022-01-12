public java.lang.String getUpdateVersion() {
    if ((document) != null) {
        org.w3c.dom.Node latestFile = document.getElementsByTagName("item").item(0);
        org.w3c.dom.NodeList children = latestFile.getChildNodes();
        java.lang.String version = children.item(1).getTextContent();
        return version.toUpperCase();
    }
    return null;
}