@java.lang.Override
public void pause() {
    if ((currentState) != (com.kaltura.playersdk.players.KPlayerController.UIState.Pause)) {
        currentState = com.kaltura.playersdk.players.KPlayerController.UIState.Pause;
        if (!(isCasting)) {
            if ((isBackgrounded) && (isIMAActive)) {
                if ((imaManager) != null) {
                    imaManager.pause();
                }
            }else {
                if ((player) != null) {
                    player.pause();
                }
            }
        }else {
            if ((castPlayer) != null) {
                castPlayer.pause();
            }
        }
    }
}