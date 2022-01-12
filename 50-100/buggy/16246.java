@java.lang.Override
public void onDestroyView() {
    org.bottiger.podcast.SoundWaves.getBus().unregister(mAdapter);
    org.bottiger.podcast.SoundWaves.getBus().unregister(mPlayerSeekbar);
    org.bottiger.podcast.SoundWaves.getAppContext(getContext()).getPlayer().removeListener(mCurrentTime);
    org.bottiger.podcast.SoundWaves.getAppContext(getContext()).getPlayer().removeListener(mPlayPauseButton);
    super.onDestroyView();
}