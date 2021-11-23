@java.lang.Override
public void onEvent(final org.apache.ignite.events.Event evt) {
    java.util.UUID nodeId = ((org.apache.ignite.events.DiscoveryEvent) (evt)).eventNode().id();
    org.apache.ignite.internal.processors.query.h2.opt.GridH2QueryContext.clearAfterDeadNode(locNodeId, nodeId);
    org.apache.ignite.internal.processors.query.h2.twostep.GridMapQueryExecutor.NodeResults nodeRess = qryRess.remove(nodeId);
    if (nodeRess == null)
        return ;
    
    for (org.apache.ignite.internal.processors.query.h2.twostep.GridMapQueryExecutor.QueryResults ress : nodeRess.results().values())
        ress.cancel(true);
    
}