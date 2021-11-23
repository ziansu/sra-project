@java.lang.Override
public <T> T getProperty(final java.lang.String key) {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    graph.setCurrentGraphInThreadLocal();
    if ((rawElement) == null)
        return null;
    
    return super.getProperty(key);
}