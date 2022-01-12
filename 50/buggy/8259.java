public json.JSONObject getAncestralGraphJSON(java.lang.String nodeLabel) {
    api.PartialOrderGraph graph = asr.getGraph(nodeLabel);
    vis.POAGJson json = new vis.POAGJson(graph);
    java.lang.System.out.println(("root: " + (json.toJSON())));
    return json.toJSON();
}