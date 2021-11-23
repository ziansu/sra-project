public java.net.URL getFor(int number) throws java.lang.Exception {
    org.w3c.dom.NodeList nodeList = this.getDocument().getElementsByTagName("version");
    for (int i = 0; i < (nodeList.getLength()); i++) {
        java.lang.String version = nodeList.item(i).getTextContent();
        if (version.endsWith(java.lang.String.valueOf(number))) {
            return this.formatForVersion(version);
        }
    }
    return getFor((number + 1));
}