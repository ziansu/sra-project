@java.lang.Override
public void start(org.opennms.protocols.rt.ReplyHandler<org.opennms.netmgt.icmp.jna.JnaPingReply> callback) {
    m_callback = callback;
    m_v4.start();
    m_v6.start();
}