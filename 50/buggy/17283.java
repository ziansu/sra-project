@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.reset();
    ibPlay.setImageResource(R.drawable.ic_track_play);
    floatingActionButton.setVisibility(View.VISIBLE);
    rlPlayer.setVisibility(View.GONE);
}