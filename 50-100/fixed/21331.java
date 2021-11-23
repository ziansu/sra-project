private void tagIsolationRegions(com.ibm.json.java.JSONObject graph) {
    java.util.List<com.ibm.json.java.JSONObject> isolateOperators = com.ibm.streamsx.topology.generator.spl.GraphUtilities.findOperatorByKind(GraphBuilder.ISOLATE, graph);
    for (com.ibm.json.java.JSONObject jso : isolateOperators) {
        checkValidColocationRegion(jso, graph);
    }
    for (com.ibm.json.java.JSONObject isolate : isolateOperators) {
        assignColocations(isolate, com.ibm.streamsx.topology.generator.spl.GraphUtilities.getParents(isolate, graph), graph);
        assignColocations(isolate, com.ibm.streamsx.topology.generator.spl.GraphUtilities.getChildren(isolate, graph), graph);
    }
    tagIslandIsolatedRegions(graph);
    com.ibm.streamsx.topology.generator.spl.GraphUtilities.removeOperators(isolateOperators, graph);
}