public boolean playGame() {
    currentPlayer = player1;
    while (!(board.isFull())) {
        getPlayerMove(currentPlayer);
        java.lang.System.out.println(boardRules.getBoardWinner());
        if ((!(boardRules.getBoardWinner().isEmpty())) || (board.isFull())) {
            return false;
        }
        switchPlayers();
    } 
    return true;
}