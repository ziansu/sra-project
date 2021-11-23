private static blackjack.Card dealCard(boolean faceUp) {
    java.util.Random randomGenerator = new java.util.Random();
    int index = randomGenerator.nextInt(((blackjack.Main.deck.size()) - 1));
    blackjack.Card dealtCard = blackjack.Main.deck.get(index);
    dealtCard.setFaceUp(faceUp);
    blackjack.Main.deck.remove(index);
    return dealtCard;
}