protected java.util.Properties parseAttributes(org.w3c.dom.Node node) {
    java.util.Properties attributes = new java.util.Properties();
    org.w3c.dom.NamedNodeMap nnm = node.getAttributes();
    for (int i = 0; i < (nnm.getLength()); i++) {
        org.w3c.dom.Node attribute = nnm.item(i);
        java.lang.String value = parsePropertyTokens(attribute.getNodeValue());
        attributes.put(attribute.getNodeName(), value);
    }
    return attributes;
}