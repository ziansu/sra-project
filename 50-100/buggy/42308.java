public void startGame(java.lang.String opponent) {
    game.addPlayer(new utwente.ss.connect.common.model.players.Player(opponent));
    game.getPlayers().get(0).setBead(new utwente.ss.connect.common.model.Bead(utwente.ss.connect.common.model.Colour.RED));
    game.getPlayers().get(0).setBead(new utwente.ss.connect.common.model.Bead(utwente.ss.connect.common.model.Colour.YELLOW));
    game.start();
}