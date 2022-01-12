public static void clearInitStack() {
    final java.lang.ThreadLocal<java.util.Deque<com.tinkerpop.blueprints.impls.orient.OrientBaseGraph>> is = com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.initializationStack;
    if (is != null)
        is.get().clear();
    
    final java.lang.ThreadLocal<com.tinkerpop.blueprints.impls.orient.OrientBaseGraph> ag = com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.activeGraph;
    if (ag != null)
        ag.set(null);
    
    final com.orientechnologies.orient.core.db.ODatabaseRecordThreadLocal dbtl = com.orientechnologies.orient.core.db.ODatabaseRecordThreadLocal.INSTANCE;
    if (dbtl != null)
        dbtl.set(null);
    
}