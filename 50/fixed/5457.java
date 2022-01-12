@org.bukkit.event.EventHandler
public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    if (isActive(event.getPlayer())) {
        if (cancelOnLogout) {
            turnOff(event.getPlayer());
        }else {
            turnOff(event.getPlayer());
        }
    }
}