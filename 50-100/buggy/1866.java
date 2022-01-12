private void setRound(eu.chessdata.chesspairing.model.ChesspairingRound round) {
    int rNumber = round.getRoundNumber();
    if (rNumber < 1) {
        throw new java.lang.IllegalStateException();
    }
    java.util.List<eu.chessdata.chesspairing.model.ChesspairingRound> rounds = mTournament.getRounds();
    rounds.remove((rNumber - 1));
    rounds.add((rNumber - 1), round);
}