public static org.json.simple.JSONObject getJson(org.jgrapht.DirectedGraph graph, java.lang.String type, graphlod.dataset.Dataset dataset) {
    return graphlod.output.JsonOutput.getJsonObject(graph.vertexSet(), graph.edgeSet(), new java.util.HashSet<java.lang.String>(), new java.util.HashSet<org.jgraph.graph.DefaultEdge>(), true, dataset, type);
}