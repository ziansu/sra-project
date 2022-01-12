public void updateGraph(firm.Graph graph) {
    firm.BackEdges.enable(graph);
    compiler.firm.optimization.evaluation.GraphEvaluationVisitor.calculateStaticDetails(graph, getEntityDetails(graph.getEntity()));
    graph.walk(new compiler.firm.optimization.evaluation.GraphEvaluationVisitor(this));
    firm.BackEdges.disable(graph);
}