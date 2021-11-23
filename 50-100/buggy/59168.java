@java.lang.Override
public void post(org.spongepowered.api.network.RemoteConnection connection, net.minecraft.network.PacketBuffer payload) {
    final org.spongepowered.api.network.ChannelBuf buf = ((org.spongepowered.api.network.ChannelBuf) (payload));
    for (org.spongepowered.api.network.RawDataListener listener : listeners) {
        try {
            listener.handlePayload(buf, connection, Platform.Type.SERVER);
        } catch (java.lang.Throwable e) {
            getOwner().getLogger().error("Could not pass payload on channel '{}' to {}", getName(), getOwner(), e);
        }
    }
}