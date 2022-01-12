public static org.json.simple.JSONObject getJsonColored(graphlod.algorithms.GraphFeatures graphFeatures, graphlod.dataset.Dataset dataset) {
    return graphlod.output.JsonOutput.getJsonObject(graphFeatures.getVertices(), graphFeatures.getEdges(), new java.util.HashSet<java.lang.String>(), new java.util.HashSet<org.jgraph.graph.DefaultEdge>(), true, dataset, null);
}