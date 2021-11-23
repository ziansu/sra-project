@java.lang.Override
public boolean createNodeConnection(java.util.UUID node1, java.util.UUID node2) {
    if ((exitNodeMap.containsKey(node1)) || (exitNodeMap.containsKey(node2))) {
        return false;
    }
    return (graphServer.addEdge(node1, node2)) && (graphServer.addEdge(node2, node1));
}