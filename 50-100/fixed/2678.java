public double calculateProbability(int currentPoints) {
    if (this.fullDeck.isEmpty()) {
        return 0.5;
    }
    int numberOfBusts = 0;
    for (Blackjack.Card card : this.fullDeck) {
        int potentialPoints = currentPoints + (card.getPoints());
        if (potentialPoints > 21) {
            numberOfBusts++;
        }
    }
    return numberOfBusts / ((double) (this.fullDeck.size()));
}