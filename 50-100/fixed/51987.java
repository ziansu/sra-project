public void playNext() {
    if (null == (currentPlaylist_)) {
        loadPlaylist();
        currentPlaylist_ = com.mamewo.malarm24.MalarmPlayerService.wakeupPlaylist_;
    }
    if (isPlaying()) {
        stopMusic();
    }
    if (0 == (currentPlaylist_.size())) {
        return ;
    }
    int pos = currentPlaylist_.getCurrentPosition();
    pos = (pos + 1) % (currentPlaylist_.size());
    currentPlaylist_.setPosition(pos);
    playMusic(true);
}