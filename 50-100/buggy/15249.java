public static void broadcastToGame(java.lang.String game, java.lang.String message) {
    java.lang.String[] playersInGame = org.kwstudios.play.ragemode.gameLogic.PlayerList.getPlayersInGame(game);
    int i = 0;
    int imax = playersInGame.length;
    while (i < imax) {
        org.bukkit.Bukkit.getPlayer(java.util.UUID.fromString(playersInGame[i])).sendMessage(message);
        i++;
    } 
}