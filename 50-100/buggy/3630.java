public static org.json.simple.JSONObject getJson(org.jgrapht.graph.SimpleGraph graph, java.lang.String type) {
    return graphlod.output.JsonOutput.getJsonObject(graph.vertexSet(), graph.edgeSet(), new java.util.HashSet<java.lang.String>(), new java.util.HashSet<org.jgraph.graph.DefaultEdge>(), false, null, type);
}