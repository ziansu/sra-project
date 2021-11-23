public static org.w3c.dom.Node getNextSiblingOfType(final org.w3c.dom.Node current, final short nodeType, final java.lang.String name) {
    org.w3c.dom.Node sibling = current.getNextSibling();
    while (sibling != null) {
        if (((sibling.getNodeType()) == nodeType) && ((name == null) || (name.equals(sibling.getNodeName())))) {
            return sibling;
        }
        sibling = sibling.getNextSibling();
    } 
    return null;
}