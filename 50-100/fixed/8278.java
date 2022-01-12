public void hierarchySetUp(org.opennms.netmgt.model.topology.Bridge root) {
    if (root.isRootBridge())
        return ;
    
    root.setRootBridge(true);
    root.setRootPort(null);
    if ((m_bridges.size()) == 1)
        return ;
    
    for (org.opennms.netmgt.model.topology.SharedSegment segment : getSharedSegmentOnTopologyForBridge(root.getId())) {
        segment.setDesignatedBridge(root.getId());
        tier(segment, root.getId(), 0);
    }
}