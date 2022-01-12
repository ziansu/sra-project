public static boolean playerIsInGameUserList(java.util.UUID uuid) {
    for (java.lang.Integer i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        for (java.util.UUID id : game.users) {
            if (uuid == id) {
                return true;
            }
        }
    }
    return false;
}