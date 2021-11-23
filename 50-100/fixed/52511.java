@org.spongepowered.api.util.event.Subscribe
public void onPlayerJoinEvent(org.spongepowered.api.event.player.PlayerJoinEvent event) {
    org.spongepowered.api.event.player.PlayerJoinEvent pEvent = new org.spongepowered.api.event.player.PlayerJoinEvent(new com.greatmancode.tools.entities.Player(event.getPlayer().getName(), event.getPlayer().getDisplayName().toString(), event.getPlayer().getWorld().getName(), null));
    com.greatmancode.tools.events.EventManager.getInstance().callEvent(pEvent);
}