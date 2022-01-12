public void playGame(java.util.ArrayList cardDeck) {
    dealCards(cardDeck, dealer);
    dealCards(cardDeck, player1);
    dealDealerFaceDown(cardDeck);
    if (hasWon(dealer)) {
        java.lang.System.out.println("The dealer shows 21, you lose this hand.");
    }
    dealCards(cardDeck, player1);
    if (hasWon(player1)) {
        java.lang.System.out.println("WINNER WINNER CHICKEN DINNER!");
    }
}