@java.lang.Override
public void setTrapAddress(java.net.InetAddress trapAddress) {
    java.lang.String ipAddress = org.opennms.core.utils.InetAddressUtils.str(trapAddress);
    m_eventBuilder.setSnmpHost(ipAddress);
    m_eventBuilder.setInterface(trapAddress);
    long nodeId = m_trapdIpMgr.getNodeId(ipAddress);
    if (nodeId != (-1)) {
        m_eventBuilder.setNodeid(nodeId);
    }
}