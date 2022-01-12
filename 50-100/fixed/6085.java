public void processResult(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult result) {
    mMatch = result.getMatch();
    if (!(checkStatusCode(mMatch, result.getStatus().getStatusCode()))) {
        return ;
    }
    mAppContext.addListenerForMatchUpdates(this, mMatch.getMatchId());
    handleMatchStart();
}