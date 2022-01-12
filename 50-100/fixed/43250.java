public static boolean playerIsInGame(java.util.UUID uuid) {
    for (int i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        for (int b = 0; b < (game.players.size()); b++) {
            if ((game.players.get(b).getPlayer().getUniqueId()) == uuid) {
                return true;
            }
        }
    }
    return false;
}