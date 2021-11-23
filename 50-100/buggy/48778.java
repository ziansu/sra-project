public java.util.Set<java.lang.Integer> getRandomCardIndexes(int numberOfCards, java.util.Set<java.lang.Integer> omittedCardIndexes) {
    java.util.Set<java.lang.Integer> outCardIndexes = new java.util.HashSet<>();
    for (int i = 0; i < numberOfCards; i++) {
        int cardIndex = getRandomCardIndex(this.cardIndexesFromChoose, omittedCardIndexes);
        outCardIndexes.add(cardIndex);
        omittedCardIndexes.add(cardIndex);
    }
    return outCardIndexes;
}