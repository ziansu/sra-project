public void enterResult(com.swisstournament.sh4ke.swisstournament.Core.Player.Player p1, int won_p1, com.swisstournament.sh4ke.swisstournament.Core.Player.Player p2, int won_p2) throws java.lang.IllegalStateException, java.security.InvalidParameterException {
    if (((currentRound) != null) && (currentRound.isStarted())) {
        currentRound.enterResult(p1, won_p1, p2, won_p2);
    }else {
        throw new java.lang.IllegalStateException("Round has not started yet. Can't enter results.");
    }
}