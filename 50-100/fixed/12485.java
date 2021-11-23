synchronized void releaseNodeState(final org.opendaylight.bgpcep.pcep.topology.provider.TopologyNodeState nodeState, final org.opendaylight.protocol.pcep.PCEPSession session, final boolean persistNode) {
    this.nodes.remove(org.opendaylight.bgpcep.pcep.topology.provider.ServerSessionManager.createNodeId(session.getRemoteAddress()));
    if (nodeState != null) {
        org.opendaylight.bgpcep.pcep.topology.provider.ServerSessionManager.LOG.debug("Node {} unbound", nodeState.getNodeId());
        nodeState.released(persistNode);
    }
}