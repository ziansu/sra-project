@java.lang.Override
public void handle(org.spout.api.protocol.Session session, org.spout.api.player.Player player, org.spout.vanilla.protocol.msg.ServerListPingMessage message) {
    java.lang.System.out.println("Server list ping event");
    org.spout.vanilla.event.game.ServerListPingEvent event = new org.spout.vanilla.event.game.ServerListPingEvent(session.getAddress().getAddress(), "Spout Server", org.spout.api.Spout.getGame().getOnlinePlayers().length, org.spout.api.Spout.getGame().getMaxPlayers());
    org.spout.api.Spout.getGame().getEventManager().callEvent(event);
    session.send(new org.spout.vanilla.protocol.msg.KickMessage(event.getMessage()));
}