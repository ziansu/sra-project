public void offer(org.voltdb.messaging.InitiateResponseMessage msg, org.voltcore.messaging.Mailbox mailbox, long handle) {
    m_lastSafeTruncationHandle = handle;
    m_mailbox = mailbox;
    if (((m_lastSafeTruncationHandle) >= (msg.getSpHandle())) || ((m_lastSafeTruncationHandle) == (java.lang.Long.MIN_VALUE))) {
        m_mailbox.send(msg.getInitiatorHSId(), msg);
        return ;
    }
    m_responseMessageQueue.add(new org.voltdb.iv2.ShortCircuitReadLog.Item(msg));
    return ;
}