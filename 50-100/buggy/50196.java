public com.tinkerpop.blueprints.Graph generateGraph(final java.lang.String graphDirectoryName) {
    final java.lang.String directory = getWorkingDirectory();
    com.tinkerpop.blueprints.impls.neo4j2.Neo4j2Graph graph = new com.tinkerpop.blueprints.impls.neo4j2.Neo4j2GraphTest.Neo4jTest2Graph(((directory + "/") + graphDirectoryName));
    graph.setCheckElementsInTransaction(true);
    com.tinkerpop.blueprints.impls.neo4j2.Neo4j2GraphTest.testGraph.set(graph);
    return graph;
}