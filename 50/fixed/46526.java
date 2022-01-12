@org.bukkit.event.EventHandler
public void onQuit(org.bukkit.event.player.PlayerQuitEvent e) {
    ru.mrbrikster.safeauth.PluginManager.clearErrors(e.getPlayer());
}