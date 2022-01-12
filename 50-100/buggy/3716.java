public boolean beats(Blackjack.Hand other) {
    int myScore = getTotalPoints();
    if (myScore > 21) {
        return false;
    }
    int otherScore = other.getTotalPoints();
    if (otherScore > myScore) {
        return false;
    }
    return true;
}