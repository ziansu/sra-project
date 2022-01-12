@java.lang.Override
public void onPlayerConnect(uno.network.api.Player player) {
    if ((hostPlayer) == null) {
        uno.server.core.GameServer.logger.info("Started new game lobby!");
        hostPlayer = player;
    }
    (currentPlayerCount)++;
    sendToAllPlayers(("currentplayer#" + (currentPlayerCount)));
    uno.server.core.GameServer.logger.info(((((("Player connected: " + (player.getAddress())) + ": ") + (player.getID())) + " #") + (currentPlayerCount)));
}