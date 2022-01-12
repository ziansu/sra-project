@java.lang.Override
protected org.neo4j.graphdb.Node fetchNextOrNull() {
    assert ids != null : "ids null";
    assert (nodeManager) != null : "nodeManager null";
    return ids.hasNext() ? nodeManager.newNodeProxyById(ids.next()) : null;
}