@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mediaPlayer.seekTo(0);
    fab.setImageResource(R.drawable.ic_play);
}