public void removePlayer(boolean shouldSaveState) {
    isBackgrounded = true;
    currentState = com.kaltura.playersdk.players.KPlayerController.UIState.Pause;
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
            if ((imaManager) != null) {
                imaManager.pause();
            }
        }
    }
}