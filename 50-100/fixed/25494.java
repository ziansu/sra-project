void addNode(int speed) {
    for (com.damianhxy.Node_EACO node : nodes) {
        node.addNode();
    }
    nodes.add(new com.damianhxy.Node_EACO(((numNodes)++), speed, edgeList));
    adjList.add(new java.util.ArrayList<>());
}