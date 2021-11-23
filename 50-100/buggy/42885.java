@java.lang.Override
public void run() {
    displayIntermediateHands(cardsDisplayed);
    if (cardsDisplayed == ((manager.players[0].hand.size()) - 1)) {
        if (manager.getPlayers()[currentPlayerInteracting].isBot)
            botHandle(250);
        else {
            if ((botCount) != 3) {
                displayHands((-1), false);
                displayWaitScreen(currentPlayerInteracting);
            }else {
                displayHands(currentPlayerInteracting, true);
                canClick = true;
            }
        }
    }
}