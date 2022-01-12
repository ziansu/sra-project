public backend.Race getCurrentRound() {
    if ((this.rounds.size()) > (this.currentRound)) {
        return this.rounds.get(this.currentRound);
    }
    throw new java.lang.IllegalArgumentException("Current round does not exist in this.rounds");
}