@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOWEST)
public void OnPlayerLogin(org.bukkit.event.player.PlayerLoginEvent event) {
    final java.lang.String name = associations.getCurrentName(event.getPlayer().getUniqueId());
    if (name == null)
        associations.addPlayer(event.getPlayer().getName(), event.getPlayer().getUniqueId());
    
    if ((game) != null)
        game.setPlayerProfle(event.getPlayer(), name);
    
}