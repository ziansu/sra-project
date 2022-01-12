private org.w3c.dom.Node getOutSocket(org.w3c.dom.Node parent) {
    org.w3c.dom.Node outSocket = null;
    for (int i = 0; i < (parent.getChildNodes().getLength()); i++) {
        if (parent.getChildNodes().item(i).getNodeName().equals("outSocket"))
            outSocket = parent.getChildNodes().item(i);
        
    }
    return outSocket;
}