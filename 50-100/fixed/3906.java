@java.lang.Override
public org.kaazing.gateway.transport.wsr.WsrSession call() throws java.lang.Exception {
    org.kaazing.mina.core.buffer.IoBufferAllocatorEx<?> parentAllocator = session.getBufferAllocator();
    org.kaazing.gateway.transport.wsr.bridge.filter.WsrBufferAllocator wsrAllocator = new org.kaazing.gateway.transport.wsr.bridge.filter.WsrBufferAllocator(parentAllocator);
    org.kaazing.gateway.transport.wsr.WsrSession wsrSession = new org.kaazing.gateway.transport.wsr.WsrSession(this, getProcessor(), connectAddress, connectAddress, session, wsrAllocator, null);
    wsrSession.setRtmpAddress(rtmpAddress);
    wsrSession.suspendWrite();
    return wsrSession;
}