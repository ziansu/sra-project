public Neighborhood getNodeByValue(java.lang.Object value, Node startNode) {
    Neighborhood neighborhood = new Neighborhood();
    Node currentNode = startNode;
    Node prevNode = null;
    while ((currentNode != null) && (!(value.equals(currentNode.getValue())))) {
        prevNode = currentNode;
        currentNode = currentNode.getNext();
    } 
    neighborhood.setNode(currentNode);
    neighborhood.setPrevNode(prevNode);
    return neighborhood;
}