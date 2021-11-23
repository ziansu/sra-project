public void turn(Landable[][] board, Monopoly game) {
    game.clear();
    if (_inJail) {
        jailTurn();
    }else {
        move(board);
        game.printBoard();
        executeLandOn(board, game);
        playerOptions(game);
    }
}