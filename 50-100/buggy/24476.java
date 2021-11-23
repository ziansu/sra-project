@java.lang.Override
public void run() {
    displayIntermediateHands(cardsDisplayed);
    if (cardsDisplayed == ((manager.players[0].hand.size()) - 1)) {
        if (manager.getPlayers()[currentPlayerInteracting].isBot)
            botHandle(250);
        else {
            displayHands((-1), false);
            if ((botCount) != 3)
                displayWaitScreen();
            
        }
    }
}