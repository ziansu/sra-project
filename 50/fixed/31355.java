@org.bukkit.event.EventHandler
public void onPlayerChangedWorld(org.bukkit.event.player.PlayerChangedWorldEvent event) {
    autoFly(event);
    teleportOnWorldEnter(event);
}