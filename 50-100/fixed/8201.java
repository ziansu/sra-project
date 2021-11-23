@org.bukkit.event.EventHandler
public void onStartDungeon(yourselvs.dungeons.events.PlayerStartDungeonEvent event) {
    yourselvs.dungeons.sessions.Session session = new yourselvs.dungeons.sessions.Session(event.getPlayer().getUniqueId(), event.getDungeon(), event.getTime(), event.getPlayer().getLocation());
    plugin.getSessionManager().addSession(session);
}