public void CloseAllConnections() throws org.openrdf.repository.RepositoryException {
    src.close();
    com.tinkerpop.blueprints.KeyIndexableGraph graph = ((com.tinkerpop.blueprints.oupls.sail.GraphSail) (sr.getSail())).getBaseGraph();
    graph.shutdown();
    sr.shutDown();
}