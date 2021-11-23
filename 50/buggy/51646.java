@java.lang.Override
protected void onStop() {
    super.onStop();
    if (com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.TAG, "onStop -- ");
    
    if (com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.mGoogleApiClient.isConnected()) {
        com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.mGoogleApiClient.disconnect();
    }
}