@java.lang.Override
public void onClick(android.view.View v) {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
        mediaPlayer.setLooping(true);
        start.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.ic_action_play));
    }else {
        mediaPlayer.start();
        start.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.ic_action_pause));
    }
}