@java.lang.Override
public boolean removeNodeConnection(java.util.UUID Node1, java.util.UUID Node2) {
    return (graphServer.removeEdge(Node1, Node2)) || (graphServer.removeEdge(Node2, Node1));
}