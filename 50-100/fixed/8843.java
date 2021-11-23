public org.opennms.netmgt.model.topology.BridgePort getBridgePort(java.lang.Integer nodeid) {
    if (nodeid == null)
        return null;
    
    for (org.opennms.netmgt.model.topology.BridgePort link : m_portsOnSegment) {
        if ((link.getNode().getId().intValue()) == (nodeid.intValue()))
            return link;
        
    }
    return null;
}