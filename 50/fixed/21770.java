void removeConnection(graph.Connection connection) {
    connections.remove(connection);
    graph.structurallyChanged(connection.getStart(), connection.getEnd());
}