@java.lang.Override
protected void resultReceived(com.ctrip.hermes.core.transport.command.v2.PullMessageResultCommandV2 ack) {
    if ((ack.getOffset()) != null) {
        m_offset.set(ack.getOffset());
    }
}