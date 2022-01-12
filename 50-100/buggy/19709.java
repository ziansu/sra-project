public void setCurrentPlaybackTime(float currentPlaybackTime) {
    if (!(isCasting)) {
        if (isPlayerCanPlay) {
            if ((player) != null) {
                player.setCurrentPlaybackTime(((long) (currentPlaybackTime * 1000)));
            }
            if (currentPlaybackTime == 0.01F) {
                currentState = com.kaltura.playersdk.players.KPlayerController.UIState.Replay;
            }
        }else {
            mCurrentPlaybackTime = currentPlaybackTime;
        }
    }else {
        if ((castPlayer) != null) {
            castPlayer.setCurrentPlaybackTime((((long) (currentPlaybackTime)) * 1000));
        }
    }
}