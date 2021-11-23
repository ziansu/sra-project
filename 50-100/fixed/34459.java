public org.w3c.dom.Node getMensaNode(java.lang.String mensa, org.w3c.dom.NodeList nl) {
    for (int i = 0; i < (nl.getLength()); i++) {
        if (nl.item(i).getNodeName().equalsIgnoreCase(mensa)) {
            return nl.item(i);
        }
    }
    return null;
}