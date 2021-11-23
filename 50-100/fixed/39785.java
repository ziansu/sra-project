@java.lang.Override
public org.gradoop.model.impl.EPGraphCollection execute(org.gradoop.model.impl.EPGraph epGraph) {
    org.apache.flink.graph.Graph<java.lang.Long, org.gradoop.model.impl.EPFlinkVertexData, org.gradoop.model.impl.EPFlinkEdgeData> graph = epGraph.getGellyGraph();
    try {
        graph = graph.run(new org.gradoop.model.impl.operators.LabelPropagationAlgorithm(this.maxIterations));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    org.gradoop.model.impl.EPGraph labeledGraph = org.gradoop.model.impl.EPGraph.fromGraph(graph, null);
    org.gradoop.model.impl.operators.LabelPropagation.LongFromProperty lfp = new org.gradoop.model.impl.operators.LabelPropagation.LongFromProperty(propertyKey);
    org.gradoop.model.impl.operators.SplitBy callByPropertyKey = new org.gradoop.model.impl.operators.SplitBy(lfp, env);
    return callByPropertyKey.execute(labeledGraph);
}