private void writeHeartbeatToBuffer() {
    in().writeByte(net.openhft.chronicle.network.internal.NetworkHub.EventId.HEARTBEAT.ordinal());
    in().writeInt(0);
}