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
                player.pause();
            }
        }else {
            castPlayer.pause();
        }
    }
}