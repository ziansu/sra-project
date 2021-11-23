@java.lang.Override
protected void onRestart() {
    if (cybrilla.musicplayer.util.MusicPlayerHelper.getInstance().getMediaPlayer().isPlaying()) {
        android.util.Log.e("Song Detail Activity", "Pause button being set");
        detailController.setImageResource(android.R.drawable.ic_media_pause);
    }
    super.onRestart();
}