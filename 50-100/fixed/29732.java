public void onSettingsUpdated() {
    if ((playingMusic) == null)
        return ;
    
    playingMusic.setVolume(GamePreferences.instance.volMusic);
    if (GamePreferences.instance.music) {
        if (!(playingMusic.isPlaying())) {
            playingMusic.play();
        }
    }else {
        playingMusic.pause();
    }
}