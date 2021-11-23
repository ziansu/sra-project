@java.lang.Override
public void onClick(android.view.View v) {
    if ((mainAnimator) == null) {
        mainAnimator = createMainAnimatorSet(v);
    }
    if ((mediaPlayer) == null) {
        mediaPlayer = android.media.MediaPlayer.create(this, R.raw.ohyeah);
    }
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.stop();
        try {
            mediaPlayer.prepare();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    mediaPlayer.start();
    mainAnimator.start();
}