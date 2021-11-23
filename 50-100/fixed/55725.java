@java.lang.Override
protected void onResume() {
    if ((((musicClass.exit) == true) && ((musicClass.musicOn) == true)) && ((musicClass.playing) == false)) {
        musicClass.mpPlayer.start();
        musicClass.playing = true;
    }
    musicClass.exit = false;
    transition = false;
    super.onResume();
}