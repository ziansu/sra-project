public java.util.List<org.scify.memori.card.Card> getMemoriCards(int numOfCards) {
    cards = this.cardDBHandlerJSON.getCardsFromDB(numOfCards);
    return shuffleCards(cards);
}