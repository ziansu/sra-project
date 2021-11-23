protected void processResult(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult result) {
    mMatch = result.getMatch();
    if (!(checkStatusCode(mMatch, result.getStatus().getStatusCode()))) {
        return ;
    }
    if (mMatch.canRematch()) {
        askForRematch();
    }
    if ((mMatch.getTurnStatus()) == (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch.MATCH_TURN_STATUS_MY_TURN)) {
        updateMatch();
    }else {
        updateView(mMatch.getData());
    }
}