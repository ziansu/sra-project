protected void setCurrentGraphInThreadLocal() {
    com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if (graph != null)
        graph.setCurrentGraphInThreadLocal();
    
}