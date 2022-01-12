@java.lang.Override
public ChannelBinding.IndexedMessageChannel createChannel(java.lang.Object plugin, java.lang.String name) throws org.spongepowered.api.network.ChannelRegistrationException {
    org.spongepowered.api.plugin.PluginContainer container = checkCreateChannelArgs(plugin, name);
    validateChannel(name);
    org.spongepowered.server.network.VanillaIndexedMessageChannel channel = new org.spongepowered.server.network.VanillaIndexedMessageChannel(this, name, container);
    registerChannel(channel);
    return channel;
}