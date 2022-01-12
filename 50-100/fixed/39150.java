public void removePlayer(boolean shouldSaveState) {
    isBackgrounded = true;
    if ((player) != null) {
        if (shouldSaveState) {
            savePlayerState();
        }else {
            isPlaying = false;
            pause();
        }
        if (!(isIMAActive)) {
            player.freezePlayer();
        }else {
            imaManager.pause();
        }
    }
}