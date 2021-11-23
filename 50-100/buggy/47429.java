private void registerEvents(org.spongepowered.api.service.event.EventManager mn) {
    if (!(MainType.MCHAT_API_ONLY.getBoolean())) {
        mn.register(new ca.q0r.sponge.mchat.events.sponge.ChatListener(), this);
        mn.register(new ca.q0r.sponge.mchat.events.sponge.CommandListener(), this);
        mn.register(new ca.q0r.sponge.mchat.events.sponge.PlayerListener(this), this);
    }
}