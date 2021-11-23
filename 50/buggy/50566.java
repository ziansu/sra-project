@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(askim.eratactics.activities.TacticsGame.TAG, "STOP");
    if (playMusic)
        mBackgroundSound.end();
    
}