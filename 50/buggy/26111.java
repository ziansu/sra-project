private void createGame(int numberOfPlayers) {
    try {
        players = new uk.co.mruoc.monopoly.Players(numberOfPlayers, new uk.co.mruoc.monopoly.board.Board());
        uk.co.mruoc.monopoly.Game game = new uk.co.mruoc.monopoly.Game(players);
    } catch (uk.co.mruoc.monopoly.GameException e) {
        errorMessage = e.getMessage();
    }
}