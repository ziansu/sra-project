public br.unicamp.ic.lis.tograph.graph.GraphNode createNode(java.lang.String label, br.unicamp.ic.lis.tograph.graph.GraphElementProperties properties) throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.Object> nodeProperties = new java.util.HashMap<>();
    for (br.unicamp.ic.lis.tograph.graph.GraphElementProperty property : properties) {
        nodeProperties.put(property.getKey(), property.getValue());
    }
    java.lang.Long created = inserter.createNode(nodeProperties, org.neo4j.graphdb.DynamicLabel.label(label));
    return new br.unicamp.ic.lis.tograph.graph.GraphNode(new java.net.URI(java.lang.String.valueOf(created)), label, this);
}