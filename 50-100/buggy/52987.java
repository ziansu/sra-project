private void continueAction() {
    int chosenCategory = game.calculateRoundResult(game.getCurrentPlayer().chooseCategory());
    switch (chosenCategory) {
        case Game.STATE_ROUND_WON :
            if (game.checkGameWon()) {
                displayGameWonInfo();
            }else {
                displayRoundWonInfo(chosenCategory);
                game.transferCardsToWinner();
                displayNewRoundInfo();
            }
            break;
        case Game.STATE_ROUND_DRAW :
            displayRoundDrawInfo();
            game.transferCardsToCommunal();
            displayNewRoundInfo();
            break;
    }
}