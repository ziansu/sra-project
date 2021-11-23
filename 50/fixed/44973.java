public com.mister.lib.model.Round getLastRound() {
    if ((lastRoundPointer) >= 0) {
        return rounds.get(lastRoundPointer);
    }
    return null;
}