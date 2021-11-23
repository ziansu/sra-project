public Card dealCard(int cardNum) {
    cardsLeft = (cardsLeft) - 1;
    java.lang.System.out.println(cardsLeft);
    return deckOfCards[cardNum];
}