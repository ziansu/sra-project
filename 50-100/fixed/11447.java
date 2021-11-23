private void pollGraphFromStack(boolean updateDb) {
    final java.util.Deque<com.tinkerpop.blueprints.impls.orient.OrientBaseGraph> stack = com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.initializationStack.get();
    stack.remove(this);
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph prevGraph = stack.peek();
    if (prevGraph != null) {
        com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.activeGraph.set(prevGraph);
        prevGraph.makeActive();
    }else {
        com.tinkerpop.blueprints.impls.orient.OrientBaseGraph.activeGraph.set(null);
        if (updateDb)
            ODatabaseRecordThreadLocal.INSTANCE.set(null);
        
    }
}