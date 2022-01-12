void addNode(int speed) {
    nodes.forEach(Node_EACO::addNode);
    nodes.add(new com.damianhxy.Node_EACO(((numNodes)++), speed, edgeList));
    adjList.add(new java.util.ArrayList<>());
}