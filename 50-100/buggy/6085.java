public void processResult(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult result) {
    mMatch = result.getMatch();
    mAppContext.addListenerForMatchUpdates(this, mMatch.getMatchId());
    if (!(checkStatusCode(mMatch, result.getStatus().getStatusCode()))) {
        return ;
    }
    handleMatchStart();
}