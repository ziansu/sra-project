public void startNewSong() {
    stopAlreadyPlayingMedia();
    java.lang.String path = obtainNextSongPath();
    if (path.isEmpty()) {
        return ;
    }
    mediaPlayer = new javafx.scene.media.MediaPlayer(new javafx.scene.media.Media(path));
    durationLabelListeners();
    mediaPlayer.play();
    bindVolumeProperties();
    setNextSong();
    changePlayLabel();
}