@java.lang.Override
public void onClick(final android.view.View v) {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        ((android.widget.ImageButton) (v)).setImageResource(R.drawable.ic_track_play);
        floatingActionButton.setVisibility(View.VISIBLE);
        rlPlayer.setVisibility(View.GONE);
    }else {
        mediaPlayer.start();
        ((android.widget.ImageButton) (v)).setImageResource(R.drawable.ic_track_stop);
    }
}