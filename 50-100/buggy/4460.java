public void offer(org.voltdb.messaging.InitiateResponseMessage msg, org.voltcore.messaging.Mailbox mailbox, long handle) {
    m_lastSafeTruncationHandle = msg.getSpHandle();
    m_mailbox = mailbox;
    if ((handle >= (m_lastSafeTruncationHandle)) || (handle == (java.lang.Long.MIN_VALUE))) {
        m_mailbox.send(msg.getInitiatorHSId(), msg);
        return ;
    }
    m_responseMessageQueue.add(new org.voltdb.iv2.ShortCircuitReadLog.Item(msg));
    return ;
}