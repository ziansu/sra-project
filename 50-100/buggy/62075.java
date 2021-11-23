@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (playButton_)) {
        if (player_.isPlaying()) {
            player_.pauseMusic();
        }else {
            if ((null == (state_.loadedEpisode_)) || (state_.loadedEpisode_.isEmpty())) {
                return ;
            }
            updatePlaylist();
            if (!(player_.restartMusic())) {
                player_.playMusic();
            }
        }
        updatePlayButton();
    }
}