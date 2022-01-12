@java.lang.Override
protected void onPause() {
    super.onPause();
    if (pauseMusic) {
        if ((com.example.mitch.cognoquizapp.View.GameActivity.player) != null) {
            com.example.mitch.cognoquizapp.View.GameActivity.player.stop();
        }
    }
}