public synchronized com.sun.messaging.jmq.jmsserver.core.Packet getPacket() {
    com.sun.messaging.jmq.jmsserver.core.Packet pkt = getPacketObject();
    if ((pkt != null) || (destroyed)) {
        return pkt;
    }
    assert persist;
    if (!(persist)) {
        return null;
    }
    pkt = recoverPacket();
    assert pkt != null;
    setPacketObject(true, pkt);
    return pkt;
}