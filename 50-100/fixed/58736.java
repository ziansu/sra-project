@java.lang.Override
public com.tinkerpop.blueprints.impls.orient.OrientVertex getVertex(final com.tinkerpop.blueprints.Direction direction) {
    final com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = setCurrentGraphInThreadLocal();
    if (direction.equals(Direction.OUT))
        return new com.tinkerpop.blueprints.impls.orient.OrientVertex(graph, getOutVertex());
    else
        if (direction.equals(Direction.IN))
            return new com.tinkerpop.blueprints.impls.orient.OrientVertex(graph, getInVertex());
        else
            throw com.tinkerpop.blueprints.util.ExceptionFactory.bothIsNotSupported();
        
    
}