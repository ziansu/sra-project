@java.lang.Override
public void pause() {
    super.pause();
    setState(org.gtlp.yasb.SoundPlayer.MediaPlayerState.PAUSED);
    if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) && ((objectAnimator) != null)) {
        objectAnimator.setTarget(null);
    }else
        if ((seeker) != null) {
            seeker.pause = true;
        }
    
    setPlayPauseButtonStates(true, false);
}