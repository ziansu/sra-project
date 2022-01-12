private void defineMediaPlayerBehavior(final javafx.scene.media.MediaPlayer player, final javafx.scene.control.Button button) {
    player.setCycleCount((myCycleCountIsIndefinite ? javafx.scene.media.MediaPlayer.INDEFINITE : 1));
    player.setOnPlaying(() -> playVideo(player, button));
    player.setOnPaused(() -> pauseVideo(player, button));
    player.setOnReady(() -> runOnReady(player));
    if (!(myCycleCountIsIndefinite)) {
        player.setOnEndOfMedia(() -> displayReplayOption(player, button));
    }
}