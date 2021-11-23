private boolean isConnectionLimitReached(int vertex) {
    if ((adjacencyList.get(vertex).size()) != (numberOfConnections)) {
        return false;
    }
    return true;
}