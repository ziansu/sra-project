public void loadMatch(java.lang.String matchId) {
    mCurrentMatchId = matchId;
    Games.TurnBasedMultiplayer.loadMatch(mGoogleApiClient, mCurrentMatchId).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult>() {
        @java.lang.Override
        public void onResult(@android.support.annotation.NonNull
        com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult result) {
            mCurrentMatch = result.getMatch();
            takeTurn();
            mEditor.putString(Constants.PREFERENCES_MATCH_ID, mCurrentMatchId);
            mEditor.commit();
        }
    });
}