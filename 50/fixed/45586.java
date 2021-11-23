public void addNodeToResourceTypesIndex(final java.lang.String key, final org.neo4j.graphdb.Node node) {
    addNodeToIndex(GraphStatics.URI, key, node, tempResourceTypes, resourceTypes);
    addNodeToResourcesIndex(key, node);
}