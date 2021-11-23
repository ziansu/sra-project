@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((GameActivity.player) != null) {
        if (!(GameActivity.player.isPlaying())) {
            GameActivity.player.start();
        }
    }
}