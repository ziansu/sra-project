@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.Intent intent = new android.content.Intent(this, cybrilla.musicplayer.util.MediaPlayerService.class);
    intent.setAction(Constants.STOP_NOTIFICATION);
    startService(intent);
    if (cybrilla.musicplayer.util.MusicPlayerHelper.getInstance().getMediaPlayer().isPlaying()) {
        seekUpdation();
    }
}