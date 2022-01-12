public static org.json.simple.JSONObject getJson(org.jgrapht.DirectedGraph graph, org.jgrapht.DirectedGraph surroundingGraph, java.lang.String type, graphlod.dataset.Dataset dataset) {
    return graphlod.output.JsonOutput.getJsonObject(graph.vertexSet(), graph.edgeSet(), surroundingGraph.vertexSet(), surroundingGraph.edgeSet(), true, dataset, type);
}