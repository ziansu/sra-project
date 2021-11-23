private java.lang.String getInteractionReffromNode(org.w3c.dom.Node node) {
    org.w3c.dom.Node subnode = node.getFirstChild();
    do {
        if (subnode.getNodeName().equals("InteractionRef")) {
            return subnode.getAttributes().getNamedItem("xlink:href").getNodeValue();
        }
        subnode = subnode.getNextSibling();
    } while (subnode != null );
    return null;
}