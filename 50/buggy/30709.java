@java.lang.Override
protected void resultReceived(com.ctrip.hermes.core.transport.command.v2.PullMessageResultCommandV2 ack) {
    m_offset.set(ack.getOffset());
}