public void actionPerformed(java.awt.event.ActionEvent arg0) {
    int playerState = soundPlayer.getPlayerState();
    soundPlayer.myStop();
    timer.cancel();
    if ((playerState == (SoundPlayer.PLAYER_STATE_RECORD)) && (!(jMenuItemOptionRecorderMode.isSelected()))) {
        changeStateStop();
    }
}