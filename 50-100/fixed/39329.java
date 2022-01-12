javafx.util.Pair<java.lang.Integer, java.lang.Integer> tick() {
    ++(currentTime);
    generatePackets();
    for (com.damianhxy.Edge_ACO edge : edgeList) {
        if (edge.isOffline)
            continue;
        
        processEdge(edge);
    }
    for (com.damianhxy.Node_EACO node : nodes) {
        if (node.isOffline)
            continue;
        
        processNode(node);
    }
    javafx.util.Pair<java.lang.Integer, java.lang.Integer> ret = new javafx.util.Pair<>(success, failure);
    success = failure = 0;
    return ret;
}