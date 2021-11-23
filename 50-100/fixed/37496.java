public static murdermystery.game.Game getGameByPlayerUUID(java.util.UUID uuid) {
    for (int i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        for (java.util.UUID id : game.users) {
            if (id == uuid) {
                return game;
            }
        }
    }
    return null;
}