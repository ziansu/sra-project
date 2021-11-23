private com.MAVLink.MAVLinkPacket getAttitudeMsg() {
    com.MAVLink.common.msg_attitude msg = new com.MAVLink.common.msg_attitude();
    msg.yaw = (msgHighLatency.heading) / 100;
    msg.pitch = ((float) (((msgHighLatency.pitch) * (java.lang.Math.PI)) / 18000.0));
    msg.roll = ((float) (((msgHighLatency.roll) * (java.lang.Math.PI)) / 18000.0));
    return pack(msg);
}