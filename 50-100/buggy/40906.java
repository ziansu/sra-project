private void processResult(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult result) {
    mMatch = result.getMatch();
    if (!(checkStatusCode(mMatch, result.getStatus().getStatusCode()))) {
        return ;
    }
    try {
        mTurnData.update(mMatch.getData());
        if ((mMatch.getTurnStatus()) == (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch.MATCH_TURN_STATUS_MY_TURN)) {
            updateMatch();
        }else {
            updateView();
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}