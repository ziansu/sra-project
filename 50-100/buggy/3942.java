public void updateGraph(firm.Graph graph) {
    entityDetails.remove(graph.getEntity());
    firm.BackEdges.enable(graph);
    compiler.firm.optimization.evaluation.GraphEvaluationVisitor.calculateStaticDetails(graph, getEntityDetails(graph.getEntity()));
    graph.walk(new compiler.firm.optimization.evaluation.GraphEvaluationVisitor(this));
    firm.BackEdges.disable(graph);
}