@java.lang.Override
public void onPlayerStateChanged(boolean b, int i) {
    android.util.Log.d("VideoPlayerActivity", (((("onPlayerStateChanged() called with: b = [" + b) + "], i = [") + i) + "]"));
    if (player.getPlayWhenReady()) {
        playPause.setImageResource(R.drawable.play_to_pause_avd);
    }else {
        playPause.setImageResource(R.drawable.pause_to_play_avd);
    }
    android.graphics.drawable.Drawable d = playPause.getDrawable();
    if (d instanceof android.graphics.drawable.Animatable) {
        ((android.graphics.drawable.Animatable) (d)).start();
    }
}