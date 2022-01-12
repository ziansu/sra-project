public org.w3c.dom.Node getMensaNode(java.lang.String mensa, org.w3c.dom.NodeList nl) {
    org.w3c.dom.Node m = null;
    for (int i = 0; i < (nl.getLength()); i++) {
        if (nl.item(i).getNodeName().equalsIgnoreCase(mensa)) {
            m = nl.item(i);
            return m;
        }
    }
    return null;
}