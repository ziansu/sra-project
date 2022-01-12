public void songPicked(android.view.View view) {
    musicSrv.setSong(java.lang.Integer.parseInt(view.getTag().toString()));
    musicSrv.playSong();
    if (playbackPaused) {
        setController();
        playbackPaused = false;
    }
    controller.show(0);
}