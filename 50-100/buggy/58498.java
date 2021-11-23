public com.orientechnologies.orient.core.db.record.OIdentifiable getOutVertex() {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if ((vOut) != null)
        return vOut;
    
    if (graph != null)
        graph.setCurrentGraphInThreadLocal();
    
    final com.orientechnologies.orient.core.record.impl.ODocument doc = getRecord();
    if (doc == null)
        return null;
    
    if (((settings) != null) && (settings.isKeepInMemoryReferences()))
        return doc.rawField(OrientBaseGraph.CONNECTION_OUT);
    else
        return doc.field(OrientBaseGraph.CONNECTION_OUT);
    
}