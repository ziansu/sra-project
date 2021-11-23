private void registerEvents(org.spongepowered.api.service.event.EventManager mn) {
    if (!(MainType.MCHAT_API_ONLY.getBoolean())) {
        mn.register(this, new ca.q0r.sponge.mchat.events.sponge.ChatListener());
        mn.register(this, new ca.q0r.sponge.mchat.events.sponge.CommandListener());
        mn.register(this, new ca.q0r.sponge.mchat.events.sponge.PlayerListener(this));
    }
}