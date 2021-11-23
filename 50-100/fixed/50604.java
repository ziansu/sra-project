protected void finishTurn(java.lang.String participantId, byte[] turnData) {
    updateView();
    Games.TurnBasedMultiplayer.takeTurn(getApiClient(), mMatch.getMatchId(), turnData, participantId).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult>() {
        @java.lang.Override
        public void onResult(@android.support.annotation.NonNull
        com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult updateMatchResult) {
            processResult(updateMatchResult);
        }
    });
}