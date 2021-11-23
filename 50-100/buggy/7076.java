public java.lang.String getTextContent() {
    boolean saveTextContentOld;
    saveTextContentOld = saveTextContent;
    saveTextContent = true;
    if (!(getNextNode())) {
        return null;
    }
    saveTextContent = saveTextContentOld;
    if ((nodeType) != (org.quicktionary.backend.parsers.XMLParser.NodeType.TEXT)) {
        return null;
    }
    return textContent;
}