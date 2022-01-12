public static org.json.simple.JSONObject getJson(graphlod.algorithms.GraphFeatures graphFeatures) {
    return graphlod.output.JsonOutput.getJsonObject(graphFeatures.getVertices(), graphFeatures.getEdges(), new java.util.HashSet<java.lang.String>(), new java.util.HashSet<org.jgraph.graph.DefaultEdge>(), false, null, graphFeatures.getType());
}