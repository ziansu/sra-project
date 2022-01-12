private void oneRound() {
    board.displayBoard();
    do {
        oneTurn();
    } while (!(gameIsOver()) );
    if (board.hasWinner()) {
        if ((lastTurn) == 'X') {
            human.addWin();
            java.lang.System.out.println("Congratulations you won!!");
        }else {
            computer.addWin();
            java.lang.System.out.println("Sorry you lost, try again!");
        }
    }else {
        java.lang.System.out.println("It's a tie!");
    }
    addGame();
    printScoreboard();
}