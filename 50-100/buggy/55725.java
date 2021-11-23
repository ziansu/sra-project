@java.lang.Override
protected void onResume() {
    if (((musicClass.exit) == true) && ((musicClass.musicOn) == true)) {
        musicClass.mpPlayer.start();
        musicClass.mpPlayer.seekTo(musicClass.length);
        musicClass.playing = true;
        musicClass.exit = false;
    }
    transition = false;
    super.onResume();
}