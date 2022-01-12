@java.lang.Override
public void update(long t) {
    if ((t - (heartbeatLast)) >= (heartbeatInterval)) {
        heartbeatLast = t;
        org.mavlink.messages.common.msg_heartbeat msg = new org.mavlink.messages.common.msg_heartbeat(sysId, componentId);
        sendMessage(msg);
    }
}