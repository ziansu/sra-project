@java.lang.Override
public java.lang.Object getId() {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if ((rawElement) == null)
        return ((vOut.getIdentity()) + "->") + (vIn.getIdentity());
    
    setCurrentGraphInThreadLocal();
    return super.getId();
}