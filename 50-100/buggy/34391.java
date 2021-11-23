void playRound(java.util.ArrayList<com.wolfe.Player> players) {
    java.lang.System.out.println();
    java.lang.System.out.println(("****** Play a Turn ****** Player " + (name)));
    printAllPlayerHands(players);
    com.wolfe.Deck.printPlayerDrawsFrom();
    drawACard();
    checkCardUpStatus();
    if (GolfManager.allCardsUp) {
        for (com.wolfe.Player player : players) {
            int turnScore = player.hand.scoreAllCards();
            player.scoreRound += turnScore;
            player.score += turnScore;
        }
    }
    printAllPlayerHands(players);
    com.wolfe.Deck.printPlayerDrawsFrom();
}