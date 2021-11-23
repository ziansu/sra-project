public void stopCasting() {
    isCasting = false;
    switchingBackFromCasting = true;
    if ((player) != null) {
        ((android.view.View) (player)).setVisibility(View.VISIBLE);
        player.setPlayerCallback(this);
        player.setPlayerListener(playerListener);
        player.setCurrentPlaybackTime(castPlayer.getCurrentPlaybackTime());
        player.play();
    }
    removeCastPlayer();
}