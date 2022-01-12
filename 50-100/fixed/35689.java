public json.JSONObject getAncestralGraphJSON(java.lang.String reconType, java.lang.String nodeLabel) {
    api.PartialOrderGraph graph;
    if (reconType.equalsIgnoreCase("joint"))
        graph = asrJoint.getGraph(nodeLabel);
    else
        graph = asrMarginal.getGraph(nodeLabel);
    
    vis.POAGJson json = new vis.POAGJson(graph);
    return json.toJSON();
}