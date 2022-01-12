@org.bukkit.event.EventHandler
public void onPlayerLeave(org.bukkit.event.player.PlayerQuitEvent e) {
    me.badbones69.crazyenchantments.Main.CE.unloadCEPlayer(e.getPlayer());
}