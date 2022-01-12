private void setPlayButtonPlay() {
    android.graphics.drawable.Drawable playPic = getResources().getDrawable(R.drawable.ic_action_playback_play_black);
    playPic.setBounds(0, 0, 120, 120);
    playButton.setCompoundDrawables(playPic, null, null, null);
    playButton.setText("Play");
    audioPlayerService.showNotificationWidget();
}