public void loadup(org.w3c.dom.NodeList nodeList) {
    java.util.ArrayList<java.lang.String> path = new java.util.ArrayList<java.lang.String>();
    path.add(nodeList.item(0).getNodeName());
    loadup(nodeList, path, 0);
}