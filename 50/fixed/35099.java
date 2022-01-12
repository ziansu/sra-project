private void sendPacket(us.myles.ViaVersion.boss.ViaBossBar.UpdateAction action) {
    for (java.util.UUID uuid : new java.util.ArrayList<>(players)) {
        io.netty.buffer.ByteBuf buf = getPacket(action);
        sendPacket(uuid, buf);
    }
}