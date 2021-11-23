private void createGame(int numberOfPlayers) {
    try {
        players = new uk.co.mruoc.monopoly.Players(numberOfPlayers, new uk.co.mruoc.monopoly.board.Board());
    } catch (uk.co.mruoc.monopoly.GameException e) {
        errorMessage = e.getMessage();
    }
}