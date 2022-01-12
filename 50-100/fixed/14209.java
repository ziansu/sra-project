private void stopRadio() {
    android.util.Log.d("Red7", "Stop pressed");
    try {
        mp.stop();
        mp.release();
        playerState = 0;
        android.util.Log.d("PlayerState", playerState.toString());
        setButtonsState();
    } catch (java.lang.Exception e) {
        android.util.Log.d("Red7", "Media player has alredy been released - do nothing");
    }
}