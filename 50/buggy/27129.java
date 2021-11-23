@org.bukkit.event.EventHandler
public void onSpectatorQuit(com.thebubblenetwork.api.game.PlayerQuitEvent e) {
    com.thebubblenetwork.api.game.GameListener.setSpectating(e.getPlayer(), false);
}