@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onJoinGame(co.neweden.gamesmanager.event.GMPlayerJoinGameEvent event) {
    if ((listen) && (game.getPlaying().contains(event.getPlayer()))) {
        joinedAt.put(event.getPlayer(), java.lang.System.currentTimeMillis());
    }
}