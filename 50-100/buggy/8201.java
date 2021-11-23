public void onStartDungeon(yourselvs.dungeons.events.PlayerStartDungeonEvent event) {
    yourselvs.dungeons.sessions.Session session = new yourselvs.dungeons.sessions.Session(event.getPlayer().getUniqueId(), event.getDungeon(), event.getTime(), event.getPlayer().getLocation(), event.getPlayer().getInventory());
    plugin.getSessionManager().addSession(session);
    plugin.getMessenger().startDungeon(event.getPlayer(), plugin.getSessionManager().getSession(event.getPlayer()));
}