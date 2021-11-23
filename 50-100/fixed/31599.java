public void onClick(android.view.View v) {
    game.endTurn(mScoringSpinner.getSelectedItem().toString());
    if (game.isGameOver()) {
        endGame(v);
    }else {
        updateView();
        enableButton(mRollDiceButton);
    }
}