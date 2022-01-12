@java.lang.Override
protected void run(org.graalvm.compiler.nodes.StructuredGraph graph) {
    org.graalvm.compiler.debug.GraalError.guarantee(((graph.getNodes().count()) > 0), "Graph must contain nodes %s %s %s", graph, graph, graph.toString());
}