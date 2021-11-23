@org.bukkit.event.EventHandler
void resetHealthOnRespawn(org.bukkit.event.player.PlayerRespawnEvent event) {
    if ((event.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue()) < 60.0)
        event.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(60.0);
    else {
        double extraHearts = (event.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue()) - 60.0;
        event.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue((60.0 + (extraHearts - (extraHearts / 8))));
    }
}