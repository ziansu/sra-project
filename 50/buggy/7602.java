public boolean shouldContinue() {
    return ((players.size()) < (expectedNumberOfPlayers)) && (!(allPlayersReady()));
}