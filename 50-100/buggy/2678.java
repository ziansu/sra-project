public double calculateProbability(int currentPoints) {
    if (this.fullDeck.isEmpty()) {
        return 0.5;
    }
    int numberOfBusts = 0;
    int numberOfNonBusts = 0;
    for (Blackjack.Card card : this.fullDeck) {
        int potentialPoints = currentPoints + (card.getPoints());
        if (potentialPoints > 21) {
            numberOfBusts++;
        }else {
            numberOfNonBusts++;
        }
    }
    return numberOfBusts / ((double) (numberOfNonBusts));
}