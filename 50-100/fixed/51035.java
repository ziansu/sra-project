public void removePlayer(boolean shouldSaveState) {
    isBackgrounded = true;
    if ((player) != null) {
        if (shouldSaveState) {
            savePlayerState();
        }else {
            isPlaying = false;
            pause();
        }
        currentState = com.kaltura.playersdk.players.KPlayerController.UIState.Pause;
        if (!(isIMAActive)) {
            player.freezePlayer();
        }else {
            if ((imaManager) != null) {
                imaManager.pause();
            }
        }
    }
}