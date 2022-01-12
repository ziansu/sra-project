private void stopRadio() {
    android.util.Log.d("Red7", "Stop pressed");
    try {
        if (mp.isPlaying()) {
            mp.stop();
            mp.release();
        }
    } catch (java.lang.Exception e) {
        android.util.Log.d("Red7", "Media player has alredy been released - do nothing");
    }
    playerState = 0;
    android.util.Log.d("PlayerState", playerState.toString());
    setButtonsState();
}