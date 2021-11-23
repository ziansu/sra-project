@java.lang.Override
public void setProperty(final java.lang.String key, final java.lang.Object value) {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    graph.setCurrentGraphInThreadLocal();
    if ((rawElement) == null)
        convertToDocument();
    
    super.setProperty(key, value);
}