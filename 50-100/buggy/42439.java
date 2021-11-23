public static murdermystery.game.Game getOpenGame() {
    for (java.lang.Integer i = 0; i < (murdermystery.game.GameManager.games.size()); i++) {
        murdermystery.game.Game game = murdermystery.game.GameManager.games.get(i);
        if ((game.ingame) != true) {
            return game;
        }
    }
    return murdermystery.game.GameManager.newGame(new murdermystery.maps.Acacia());
}