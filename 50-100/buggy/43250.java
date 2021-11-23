public static boolean playerIsInGame(java.util.UUID uuid) {
    for (java.lang.Integer i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        for (java.lang.Integer b = 0; i < (game.players.size()); i++) {
            if ((game.players.get(b).getPlayer().getUniqueId()) == uuid) {
                return true;
            }
        }
    }
    return false;
}