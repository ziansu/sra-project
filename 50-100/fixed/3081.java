@java.lang.Override
public void setTrapAddress(java.net.InetAddress trapAddress) {
    m_eventBuilder.setSnmpHost(org.opennms.core.utils.InetAddressUtils.str(trapAddress));
    m_eventBuilder.setInterface(trapAddress);
    long nodeId = m_trapdIpMgr.getNodeId(org.opennms.core.utils.InetAddressUtils.str(trapAddress));
    if (nodeId != (-1)) {
        m_eventBuilder.setNodeid(nodeId);
    }
}