public void setCurrentPlaybackTime(float currentPlaybackTime) {
    if (!(isCasting)) {
        if (isPlayerCanPlay) {
            this.player.setCurrentPlaybackTime(((long) (currentPlaybackTime * 1000)));
            if (currentPlaybackTime == 0.01F) {
                currentState = com.kaltura.playersdk.players.KPlayerController.UIState.Replay;
            }
        }else {
            mCurrentPlaybackTime = currentPlaybackTime;
        }
    }else {
        castPlayer.setCurrentPlaybackTime((((long) (currentPlaybackTime)) * 1000));
    }
}