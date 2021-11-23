public boolean turn(Landable[][] board, Monopoly game) {
    game.clear();
    if (_inJail) {
        jailTurn();
        return playerOptions(game);
    }else {
        move(board);
        game.printBoard();
        executeLandOn(board, game);
        return playerOptions(game);
    }
}