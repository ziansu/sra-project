@java.lang.Override
protected void onRestart() {
    if (cybrilla.musicplayer.util.MusicPlayerHelper.getInstance().getMediaPlayer().isPlaying()) {
        detailController.setImageResource(android.R.drawable.ic_media_pause);
    }
    super.onRestart();
}