public void prev(final hu.davidp.beadando.player.model.Model m) {
    mp.stop();
    (actualElementInPlaylist)--;
    this.mp = new javafx.scene.media.MediaPlayer(m.getPlaylist().get(actualElementInPlaylist).asMedia());
    playButtonTextIsPlay = false;
    mp.play();
    mp.getOnEndOfMedia();
}