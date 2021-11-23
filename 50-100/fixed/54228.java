protected org.w3c.dom.Element getFirstChildElement(org.w3c.dom.Element parent) {
    for (int i = 0; i < (parent.getChildNodes().getLength()); i++) {
        if ((parent.getChildNodes().item(i).getNodeType()) == (org.w3c.dom.Node.ELEMENT_NODE)) {
            return ((org.w3c.dom.Element) (parent.getChildNodes().item(i)));
        }
    }
    return null;
}