public java.lang.Integer getPortForBridge(java.lang.Integer nodeid) {
    if (nodeid == null)
        return null;
    
    if (m_macsOnSegment.isEmpty()) {
        for (org.opennms.netmgt.model.topology.BridgePort link : m_portsOnSegment) {
            if ((link.getNode().getId().intValue()) == (nodeid.intValue()))
                return link.getBridgePort();
            
        }
        return null;
    }
    return null;
}