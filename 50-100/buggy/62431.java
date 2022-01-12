public void setupGame() {
    game.Player player = new game.Player(game.NormalDriver.name, 350, true);
    game = game.GameCreator.createSinglePlayer(player);
    score = new game.Score();
    game.addPlayer(player);
    player = game.getPlayerList().get(0);
    int centerConstant = ((int) (java.lang.Math.round((0.5 * ((game.Settings.getScreenWidth()) - (game.Settings.getLevelWidth()))))));
    game.Settings.setLeftMargin(centerConstant);
}