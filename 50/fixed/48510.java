private void writeHeartbeatToBuffer() {
    in().writeByte(0);
    in().writeInt(0);
}