@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mediaPlayer.start();
    android.support.design.widget.FloatingActionButton fab = ((android.support.design.widget.FloatingActionButton) (activity.findViewById(R.id.np_play_pause)));
    fab.setImageResource(R.drawable.ic_pause_white_48dp);
    fab.setClickable(true);
    android.widget.ProgressBar pb = ((android.widget.ProgressBar) (activity.findViewById(R.id.now_playing_music_progress)));
    pb.setProgress(0);
    pb.setMax(mp.getDuration());
}