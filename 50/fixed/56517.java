public void tied(swissTournamentRunner.Player p2) {
    this.logOpponent(p2);
    p2.logOpponent(this);
    this.recalculateScore();
    p2.recalculateScore();
}