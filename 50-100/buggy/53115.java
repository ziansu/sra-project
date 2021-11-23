public void songPicked(android.view.View view) {
    java.lang.Integer songIndex = ((java.lang.Integer) (java.lang.Integer.parseInt(view.getTag().toString())));
    musicSrv.setSong(songIndex);
    musicSrv.playSong();
    if (playbackPaused) {
        setController();
        playbackPaused = false;
    }
    controller.show(0);
}