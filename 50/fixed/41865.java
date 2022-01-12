@java.lang.Override
public void run() {
    if ((playbackService.getState()) == (com.lenworthrose.music.util.Constants.PlaybackState.PLAYING)) {
        updatePosition(((position) + 1000));
        handler.postDelayed(new com.lenworthrose.music.fragment.PlayingItemFragment.UpdatePositionRunnable(), 1000);
    }
}