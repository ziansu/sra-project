public void drawCard(com.aause2s15.gruppe3.cheatingandroid.CardDeck cardDeck) {
    com.aause2s15.gruppe3.cheatingandroid.Card currentCard = cardDeck.drawTopCard();
    this.playerCards.add(currentCard);
    this.sortPlayerCards();
}