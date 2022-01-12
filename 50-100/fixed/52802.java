@java.lang.Override
public com.dianping.cat.message.Heartbeat newHeartbeat(java.lang.String type, java.lang.String name) {
    if (!(m_manager.hasContext())) {
        m_manager.setup();
    }
    if (m_manager.isMessageEnabled()) {
        com.dianping.cat.message.internal.DefaultHeartbeat heartbeat = new com.dianping.cat.message.internal.DefaultHeartbeat(type, name, m_manager);
        return heartbeat;
    }else {
        return NullMessage.HEARTBEAT;
    }
}