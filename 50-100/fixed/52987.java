private void continueAction() {
    int chosenCategory = game.getCurrentPlayer().chooseCategory();
    switch (game.calculateRoundResult(chosenCategory)) {
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