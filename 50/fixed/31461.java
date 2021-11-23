@java.lang.Override
public void start(org.opennms.protocols.rt.ReplyHandler<org.opennms.netmgt.icmp.jna.JnaPingReply> callback) {
    m_callback = callback;
    if ((m_v4) != null)
        m_v4.start();
    
    if ((m_v6) != null)
        m_v6.start();
    
}