private void getCardInHandsFromMainDeck() {
    java.util.Random random = new java.util.Random();
    int num = random.nextInt(mainCardsDeckCollectionSize);
    java.lang.System.out.println(("GET RANDOM CARD ON INDEX: " + num));
    userCardDeck.add(cardsCollection.get(num));
}