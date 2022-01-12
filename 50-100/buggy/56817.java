@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult updateMatchResult) {
    saveGameState();
    if ((levelCache) != null)
        levelCache.delete();
    
    java.io.File matchCache = new java.io.File(getCacheDir(), com.nakedape.arithmos.MatchGameActivity.matchCacheFileName);
    if (matchCache.exists()) {
        if (matchCache.delete())
            android.util.Log.d(com.nakedape.arithmos.MatchGameActivity.LOG_TAG, "Match cache deleted");
        else
            android.util.Log.d(com.nakedape.arithmos.MatchGameActivity.LOG_TAG, "Error deleting match cache");
        
    }
    finish();
}