public void songPicked(android.view.View view) {
    if (playbackPaused) {
        setController();
        playbackPaused = false;
    }
    musicSrv.setSong(java.lang.Integer.parseInt(view.getTag().toString()));
    musicSrv.playSong();
    controller.show();
}