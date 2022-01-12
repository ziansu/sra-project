private void validateChannel(java.lang.String name) {
    if (org.spongepowered.server.network.VanillaChannelRegistrar.isReservedChannel(name)) {
        throw new org.spongepowered.api.network.ChannelRegistrationException("Reserved channels cannot be registered by plugins");
    }
    org.spongepowered.api.network.ChannelBinding current = channels.get(name);
    if (current != null) {
        throw new org.spongepowered.api.network.ChannelRegistrationException(((("Channel '" + name) + "' is already registered by ") + (current.getOwner())));
    }
}