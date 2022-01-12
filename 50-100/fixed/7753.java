public static void clearInitStack() {
    final java.lang.ThreadLocal<java.util.Deque<com.tinkerpop.blueprints.impls.orient.OrientBaseGraph>> is = com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.initializationStack;
    if (is != null)
        is.get().clear();
    
    final java.lang.ThreadLocal<com.tinkerpop.blueprints.impls.orient.OrientBaseGraph> ag = com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.activeGraph;
    if (ag != null)
        ag.remove();
    
}