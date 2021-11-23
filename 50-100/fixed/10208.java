@java.lang.Override
public void onClick(final android.view.View v) {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        ((android.widget.ImageButton) (v)).setImageResource(R.drawable.ic_track_play);
    }else {
        mediaPlayer.start();
        ((android.widget.ImageButton) (v)).setImageResource(R.drawable.ic_track_stop);
    }
}