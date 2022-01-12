public void endTurn() {
    game.endTurn();
    options.rollEnabled(true);
    hand.updateLabels();
    cluedo.Output.setText((("Player " + (game.getCurrentPlayer().getName())) + "\'s turn\n"));
}