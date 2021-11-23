@java.lang.Override
public void apply(final com.tinkerpop.gremlin.process.Traversal.Admin<?, ?> traversal, final com.tinkerpop.gremlin.process.TraversalEngine engine) {
    if (engine.equals(TraversalEngine.STANDARD))
        return ;
    
    final com.tinkerpop.gremlin.process.Step endStep = com.tinkerpop.gremlin.process.util.TraversalHelper.getEnd(traversal);
    if (endStep instanceof com.tinkerpop.gremlin.process.graph.marker.Reducing)
        com.tinkerpop.gremlin.process.util.TraversalHelper.replaceStep(endStep, new com.tinkerpop.gremlin.process.graph.strategy.ReducingStrategy.ReducingIdentity(traversal, ((com.tinkerpop.gremlin.process.graph.marker.Reducing) (endStep))), traversal);
    
}