public void stopPlayer() {
    savePlayerPosition();
    if ((player) != null) {
        player.stop();
        player.prepare(null);
    }
    player = null;
    mediaSource = null;
    notifyPropertyChanged(BR.mediaSource);
}