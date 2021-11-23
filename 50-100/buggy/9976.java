public java.lang.String getNodeName(java.lang.String id) {
    for (int i = 0; i < (nodeList.size()); i++) {
        if ((nodeList.get(i).getID()) == id) {
            return nodeList.get(i).getName();
        }
    }
    return null;
}