private static java.lang.String processDomNode(com.gargoylesoftware.htmlunit.html.DomNamespaceNode node) {
    if (node == null) {
        return "";
    }
    com.gargoylesoftware.htmlunit.html.DomNode child = node.getFirstChild();
    if (child instanceof org.w3c.dom.CharacterData) {
        return ((org.w3c.dom.CharacterData) (child)).getData().trim();
    }
    return node.getTextContent().trim();
}