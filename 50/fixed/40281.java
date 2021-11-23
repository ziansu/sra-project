@org.bukkit.event.EventHandler
public void onPlayerKick(org.bukkit.event.player.PlayerKickEvent e) {
    getPlayerDetails(e.getPlayer()).save();
}