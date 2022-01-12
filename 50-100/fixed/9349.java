@android.support.annotation.MainThread
public void setStatus(@org.bottiger.podcast.player.exoplayer.ExoPlayerWrapper.PlayerState
int argPlayerStatus) {
    if ((getEpisode()) == null) {
        return ;
    }
    if (getEpisode().isPlaying()) {
        if (IsDisplayingPlayIcon()) {
            animateChangeFrom(PlayPauseDrawable.IS_PAUSED);
        }
    }else {
        if (!(IsDisplayingPlayIcon())) {
            animateChangeFrom(PlayPauseDrawable.IS_PLAYING);
        }
    }
    mStatus = argPlayerStatus;
    if ((mStatus) == (org.bottiger.podcast.player.exoplayer.ExoPlayerWrapper.STATE_PREPARING)) {
        mStartTime = java.lang.System.currentTimeMillis();
    }
    this.invalidate();
}