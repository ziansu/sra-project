@java.lang.Override
protected void onPause() {
    super.onPause();
    if (pauseMusic) {
        com.example.mitch.cognoquizapp.View.GameActivity.player.stop();
    }
}