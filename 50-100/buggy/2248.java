private void endTurn() {
    int winner = RoundWonCheck();
    UpdateBoardBasedOnAnswer();
    if (winner == 0) {
        SwitchPlayer(true);
        PlayerTurnStart();
    }else {
        UpdateScoreBoard();
        int gameWinner = GameWonCheck();
        if (gameWinner == (-1)) {
            java.lang.System.out.println("Round over");
            Display.ToRoundOverFrame(CurrentPlayer, scoreBoard);
            StartRounds();
        }else {
            java.lang.System.out.println("Game over");
            Display.changeToPlayGameorCheckScoreMode(scoreBoard);
        }
    }
}