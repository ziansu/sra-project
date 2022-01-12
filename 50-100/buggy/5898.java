public void endTurn() {
    game.nextPlayer();
    options.rollEnabled(true);
    if (game.hasWon()) {
        gameOver(game.getCurrentPlayer());
    }
    hand.updateLabels();
    cluedo.Output.appendText((("Player " + (game.getCurrentPlayer().getName())) + "\'s turn\n"));
}