@java.lang.Override
public void onSecondaryViewAppeared(final com.innovativetech.audio.audiobookmaster.fabreveallayout.FABRevealLayout fabRevealLayout, android.view.View secondaryView) {
    showSecondaryViewItems();
    if ((mMediaPlayer) == null) {
        initializeMediaPlayer();
    }
    if (!(mMediaPlayer.isPlaying())) {
        mMediaPlayer.start();
    }
}