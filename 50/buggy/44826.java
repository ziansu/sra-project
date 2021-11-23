@java.lang.Override
protected void onResume() {
    super.onResume();
    if (!(GameActivity.player.isPlaying())) {
        GameActivity.player.start();
    }
}