@java.lang.Override
public void handle(us.myles.ViaVersion.api.PacketWrapper wrapper) throws java.lang.Exception {
    if (((us.myles.ViaVersion.ViaVersionPlugin) (us.myles.ViaVersion.api.ViaVersion.getInstance())).isAutoTeam()) {
        us.myles.ViaVersion.protocols.protocol1_9to1_8.storage.EntityTracker entityTracker = wrapper.user().get(us.myles.ViaVersion.protocols.protocol1_9to1_8.storage.EntityTracker.class);
        entityTracker.setAutoTeam(true);
        entityTracker.sendTeamPacket(true);
    }
}