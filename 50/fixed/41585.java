protected void replaceCardInHandsFromMainDeck(int cardPosition) {
    java.util.Random random = new java.util.Random();
    int num = random.nextInt(mainCardsDeckCollectionSize);
    java.lang.System.out.println(("GET RANDOM CARD ON INDEX: " + num));
    userCardDeck.set(cardPosition, cardsCollection.get(num));
}