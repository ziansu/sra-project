@java.lang.Override
public void onPlayerConnect(uno.network.api.Player player) {
    uno.server.core.GameServer.logger.info(((((("Player connected: " + (player.getAddress())) + ": ") + (player.getID())) + " #") + (++(currentPlayerCount))));
    if ((hostPlayer) == null) {
        uno.server.core.GameServer.logger.info("Started new game lobby!");
        hostPlayer = player;
    }
    sendToAllPlayers(("currentplayer#" + (currentPlayerCount)));
}