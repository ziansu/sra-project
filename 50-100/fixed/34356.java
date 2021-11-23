public void recalculateOppWr() {
    java.lang.Double opponentWinRate = 0.0;
    int people = 0;
    for (swissTournamentRunner.Player p : previousRounds) {
        opponentWinRate += ((double) (p.victories.size())) / (p.previousRounds.size());
        people++;
    }
    if (people != 0) {
        opponentWinRate /= previousRounds.size();
        opponentWinRate *= 100;
    }
    oppWr = opponentWinRate.intValue();
}