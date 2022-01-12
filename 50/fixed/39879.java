public boolean votingPhaseStarted() {
    com.github.sveyrat.spaceoutbreak.domain.Round currentRound = currentRound();
    return ((currentRound.getVotes()) != null) && (!(currentRound.getVotes().isEmpty()));
}